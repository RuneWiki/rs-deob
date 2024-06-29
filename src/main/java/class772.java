import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class772 {
   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11326 = new String[]{method5591(method5590("'*K 2")), method5591(method5590(";+\t\u0007:")), method5591(method5590("'*K#2"))};
   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "I"
   )
   public static int field11324;
   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "I"
   )
   public static int field11325;

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5588(int arg0) {
      boolean var1 = client.field4564;

      try {
         if (arg0 <= -57) {
            ++field11325;
            class730 var2 = (class730)class558.field8132.method2579(-801);
            if (var1 || var2 != null) {
               do {
                  label52: {
                     class210 var3 = var2.field10499;
                     if (var3.field3119) {
                        var2.method154(-119);
                        var3.method1787((byte)-67);
                        if (!var1) {
                           break label52;
                        }
                     }

                     if (var3.field3131 <= class29.field458) {
                        label54: {
                           var3.method1788((byte)45, class697.field10217);
                           if (var3.field3119) {
                              var2.method154(-121);
                              if (!var1) {
                                 break label54;
                              }
                           }

                           class627.method4591(var3, true);
                        }
                     }
                  }

                  var2 = (class730)class558.field8132.method2583(1);
               } while(var2 != null);

            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11326[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(IBII)V"
   )
   public static final void method5589(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field11324;
         String var4 = field11326[1] + arg3 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 63) + "," + (arg0 & 63);
         System.out.println(var4);
         if (arg1 == 38) {
            class741.method5343(var4, -1, false, true);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11326[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5590(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5591(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
