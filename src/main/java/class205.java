import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class205 {
   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3122 = new String[]{method1794(method1793("\u001e(\u0019g`")), method1794(method1793("\u0000p\u0019\u000b5")), method1794(method1793("\u001e(\u0019a`")), method1794(method1793("\u0015+[I")), method1794(method1793("\u001e(\u0019f`")), method1794(method1793("\u001e(\u0019d`"))};
   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "I"
   )
   public static int field3118;
   @OriginalMember(
      owner = "client!ev",
      name = "d",
      descriptor = "I"
   )
   public static int field3119;
   @OriginalMember(
      owner = "client!ev",
      name = "c",
      descriptor = "I"
   )
   public static int field3120;
   @OriginalMember(
      owner = "client!ev",
      name = "b",
      descriptor = "I"
   )
   public static int field3121;

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(Lefa;I)V"
   )
   public static final void method1789(class466 arg0, int arg1) {
      boolean var2 = client.field1786;

      RuntimeException var10000;
      label45: {
         boolean var10001;
         class168 var3;
         try {
            ++field3121;
            var3 = (class168)class497.field7567.method4972((byte)-84);
            if (arg1 != 9) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label45;
         }

         while(true) {
            label40: {
               try {
                  if (var3 != null) {
                     if (var3.field2562 == arg0) {
                        if (var3.field2557 != null) {
                           class426.field6579.method4704(var3.field2557);
                           var3.field2557 = null;
                        }

                        var3.method2477(arg1 ^ 1969);
                        return;
                     }
                     break label40;
                  }
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  return;
               }
            }

            try {
               var3 = (class168)class497.field7567.method4975((byte)99);
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class482.method3757(var4, field3122[5] + (arg0 != null ? field3122[1] : field3122[3]) + ',' + arg1 + ')');
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method1790(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3119;
         class566 var4 = class146.method1321((long)arg2, 9, -1428737160);
         int var5 = 50 / ((arg0 - 20) / 39);
         var4.method4269((byte)-124);
         var4.field8398 = arg1;
         var4.field8394 = arg3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3122[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(Lica;I)Lns;"
   )
   public static final class766 method1791(class354 arg0, int arg1) {
      try {
         if (arg1 > -9) {
            method1789((class466)null, -117);
         }

         ++field3120;
         return new class766(arg0.method2869(false), arg0.method2869(false), arg0.method2869(false), arg0.method2869(false), arg0.method2872(2), arg0.method2872(2), arg0.method2855(-31007));
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3122[2] + (arg0 != null ? field3122[1] : field3122[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method1792(int arg0, int arg1, byte arg2) {
      try {
         class637.method4659(true, arg1, arg0);
         if (arg2 == 12) {
            ++field3118;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3122[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
