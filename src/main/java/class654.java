import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class654 extends class502 {
   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9785 = new String[]{method4826(method4825("6UI\u000b6")), method4826(method4825("#\u0012Ifc")), method4826(method4825("6UI\t6")), method4826(method4825("6I\u000b$"))};
   @OriginalMember(
      owner = "client!ni",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9782 = "";
   @OriginalMember(
      owner = "client!ni",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field9783 = new class498(108, 5);
   @OriginalMember(
      owner = "client!ni",
      name = "n",
      descriptor = "I"
   )
   public static int field9784;

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "()V",
      line = 12
   )
   public static final void method4822() {
      while(true) {
         boolean var0 = true;

         for(int var1 = 0; var1 < class238.field3620.length; ++var1) {
            if (!class238.field3620[var1].method4106()) {
               synchronized(class238.field3620[var1]) {
                  class238.field3620[var1].notify();
               }

               var0 = false;
            } else {
               class725.field10846[var1] = class238.field3620[var1].method4105();
            }
         }

         if (var0) {
            class238.field3620[class238.field3620.length - 1].method4102();
            class454.method3556(1);

            while(true) {
               boolean var3 = true;

               for(int var4 = 0; var4 < class238.field3620.length - 1; ++var4) {
                  if (!class238.field3620[var4].method4106()) {
                     synchronized(class238.field3620[var4]) {
                        class238.field3620[var4].notify();
                     }

                     var3 = false;
                  }
               }

               if (var3) {
                  for(int var6 = 1; var6 < class238.field3620.length - 2; ++var6) {
                     class238.field3620[var6].method4102();
                  }

                  class454.method3556(2);

                  while(!class238.field3620[0].method4106()) {
                     synchronized(class238.field3620[0]) {
                        class238.field3620[0].notify();
                     }

                     try {
                        class697.method5128(1L, -69);
                     } catch (Exception var9) {
                     }
                  }

                  class238.field3620[0].method4102();
                  return;
               }

               try {
                  class697.method5128(1L, 55);
               } catch (Exception var12) {
               }
            }
         }

         try {
            class697.method5128(1L, 69);
         } catch (Exception var8) {
         }
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "c",
      descriptor = "(I)V",
      line = 121
   )
   public static void method4823(int arg0) {
      try {
         if (arg0 != 108) {
            method4822();
         }

         field9783 = null;
         field9782 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9785[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "([III[II)V",
      line = 132
   )
   public static final void method4824(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         if (~arg4 > ~arg1) {
            int var6 = (arg1 + arg4) / 2;
            int var7 = arg4;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            int var9 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = ~var8 != Integer.MIN_VALUE ? 1 : 0;
            int var11 = arg4;
            int var12;
            int var13;
            if (var5) {
               if (~((var10 & arg4) + var8) < ~arg0[arg4]) {
                  var12 = arg0[arg4];
                  arg0[arg4] = arg0[arg4];
                  arg0[arg4] = var12;
                  var13 = arg3[arg4];
                  arg3[arg4] = arg3[arg4];
                  var7 = arg4 + 1;
                  arg3[arg4] = var13;
                  var11 = arg4 + 1;
               } else {
                  var11 = arg4 + 1;
               }
            }

            while(true) {
               while(~var11 > ~arg1) {
                  if (~((var10 & var11) + var8) < ~arg0[var11]) {
                     var12 = arg0[var11];
                     arg0[var11] = arg0[var7];
                     arg0[var7] = var12;
                     var13 = arg3[var11];
                     arg3[var11] = arg3[var7];
                     arg3[var7++] = var13;
                     ++var11;
                  } else {
                     ++var11;
                  }
               }

               arg0[arg1] = arg0[var7];
               arg0[var7] = var8;
               arg3[arg1] = arg3[var7];
               arg3[var7] = var9;
               method4824(arg0, var7 - 1, 2, arg3, arg4);
               if (!var5) {
                  method4824(arg0, arg1, 2, arg3, var7 - -1);
                  break;
               }

               var12 = arg0[arg1];
               arg0[var11] = arg0[var7];
               arg0[var7] = var12;
               var13 = arg3[var11];
               arg3[var11] = arg3[var7];
               arg3[var7++] = var13;
               ++var11;
            }
         }

         if (arg2 != 2) {
            field9783 = null;
         }

         ++field9784;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9785[2] + (arg0 != null ? field9785[1] : field9785[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9785[1] : field9785[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4825(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4826(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
