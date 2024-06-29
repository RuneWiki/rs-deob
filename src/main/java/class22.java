import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {
   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "Ldw;"
   )
   private class748 field237 = new class748(64);
   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "Leaa;"
   )
   private class526 field235;
   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "I"
   )
   public int field232;
   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field239 = new String[]{method150(method149("(1\u0007VA")), method150(method149("&}\u0007DU=v]F\u0014")), method150(method149("=jE\u0014")), method150(method149("&}\u00079\u0014")), method150(method149("&}\u0007:\u0014"))};
   @OriginalMember(
      owner = "client!ub",
      name = "f",
      descriptor = "I"
   )
   public static int field234 = 100;
   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "I"
   )
   public static int field233;
   @OriginalMember(
      owner = "client!ub",
      name = "g",
      descriptor = "I"
   )
   public static int field236;
   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "I"
   )
   public static int field238;

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IBLaa;ILat;Lhv;II)V"
   )
   public static final void method147(int arg0, byte arg1, class512 arg2, int arg3, class396 arg4, class544 arg5, int arg6, int arg7) {
      try {
         ++field233;
         if (arg4 != null) {
            if (arg1 == -97) {
               int var8;
               label45: {
                  if (~class675.field10142 == -5) {
                     var8 = (int)class56.field706 & 16383;
                     if (client.field4530 == 0) {
                        break label45;
                     }
                  }

                  var8 = (int)class56.field706 + class241.field3071 & 16383;
               }

               int var9 = Math.max(arg5.field7986 / 2, arg5.field7954 / 2) + 10;
               int var10 = arg0 * arg0 + arg7 * arg7;
               if (~(var9 * var9) <= ~var10) {
                  int var11 = class689.field10389[var8];
                  int var12 = class689.field10391[var8];
                  if (class675.field10142 != 4) {
                     var11 = var11 * 256 / (class606.field8898 + 256);
                     var12 = var12 * 256 / (class606.field8898 + 256);
                  }

                  int var13 = arg0 * var12 + arg7 * var11 >> 14;
                  int var14 = arg7 * var12 + -(arg0 * var11) >> 14;
                  arg4.method262(arg5.field7986 / 2 + var13 + arg3 - arg4.method1971() / 2, -var14 + arg5.field7954 / 2 + (arg6 - arg4.method1975() / 2), arg2, arg3, arg6);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field239[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field239[0] : field239[2]) + ',' + arg3 + ',' + (arg4 != null ? field239[0] : field239[2]) + ',' + (arg5 != null ? field239[0] : field239[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(II)Lej;"
   )
   public final class132 method148(int arg0, int arg1) {
      try {
         ++field238;
         class748 var3 = this.field237;
         class132 var4;
         synchronized(this.field237) {
            var4 = (class132)this.field237.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg0 > -33) {
               this.field232 = 18;
            }

            class526 var5 = this.field235;
            byte[] var6;
            synchronized(this.field235) {
               var6 = this.field235.method3899(-52, arg1, 19);
            }

            class132 var7 = new class132();
            if (var6 != null) {
               var7.method1133(new class128(var6), 49);
            }

            class748 var8 = this.field237;
            synchronized(this.field237) {
               this.field237.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field239[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class22(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field235 = arg2;
         this.field232 = this.field235.method3875(0, 19);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field239[1] + (arg0 != null ? field239[0] : field239[2]) + ',' + arg1 + ',' + (arg2 != null ? field239[0] : field239[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method149(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method150(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
