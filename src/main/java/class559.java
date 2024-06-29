import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class559 {
   @OriginalMember(
      owner = "client!ac",
      name = "g",
      descriptor = "J"
   )
   public long field7934;
   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "[I"
   )
   public int[] field7933;
   @OriginalMember(
      owner = "client!ac",
      name = "f",
      descriptor = "[S"
   )
   public short[] field7931;
   @OriginalMember(
      owner = "client!ac",
      name = "i",
      descriptor = "[S"
   )
   public short[] field7932;
   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7940 = new String[]{method4162(method4161("\u0013\u0007-HC")), method4162(method4161("\u0013\u0007-OC")), method4162(method4161("\u0013\u0007-IC")), method4162(method4161("\u0005\u0006")), method4162(method4161("\u001c\u0011og")), method4162(method4161("\u0013\u0007-7\u0002\u001c\rw5C")), method4162(method4161("\tJ-%\u0016"))};
   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "Lae;"
   )
   public static class506 field7935 = new class506();
   @OriginalMember(
      owner = "client!ac",
      name = "e",
      descriptor = "Lfm;"
   )
   public static class164 field7936 = new class164(50, 3);
   @OriginalMember(
      owner = "client!ac",
      name = "d",
      descriptor = "Lsb;"
   )
   public static class261 field7938 = new class261();
   @OriginalMember(
      owner = "client!ac",
      name = "j",
      descriptor = "I"
   )
   public static int field7930;
   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "I"
   )
   public static int field7937;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ac",
      name = "h",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7939;

   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4156(int arg0) {
      try {
         field7936 = null;
         if (arg0 != 1) {
            field7936 = null;
         }

         field7935 = null;
         field7938 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7940[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "()V"
   )
   public static final void method4157() {
      for(int var0 = 0; var0 < class160.field2452; ++var0) {
         if (!class566.field8046[var0]) {
            class425 var1 = class274.field4176[var0];
            class757 var2 = var1.field6218;
            int var3 = var1.field6217;
            int var4 = var2.method5465((byte)90) - class744.field10587;
            int var5 = (var4 * 2 >> class313.field4707) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method5474(10368) - var4 >> class313.field4707;
            int var9 = var2.method5469((byte)13) - var4 >> class313.field4707;
            int var10 = var2.method5469((byte)13) + var4 >> class313.field4707;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class25.field360) {
               var10 = class25.field360 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field6214[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class155.field2381) {
                  var16 = class155.field2381 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class578 var19 = class331.method2653(var3, var17, var11, field7939 != null ? field7939 : (field7939 = method4160(field7940[3])));
                  if (var19 != null && var19.field8156 != 0) {
                     if (var19.field8156 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field6214[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field6214[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field6214[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field6214[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class566.field8046[var0] = true;
            class225.field3197[var3].method46(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(BIJ)Ljava/lang/String;"
   )
   public static final String method4158(byte arg0, int arg1, long arg2) {
      try {
         class623.method4590(false, arg2);
         ++field7937;
         int var4 = class309.field4659.get(5);
         int var5 = class309.field4659.get(2);
         int var6 = class309.field4659.get(1);
         if (~arg1 == -4) {
            return class686.method4990(arg2, 0, arg1);
         } else {
            if (arg0 != -26) {
               field7935 = null;
            }

            return Integer.toString(var4 / 10) + var4 % 10 + "-" + class229.field3560[arg1][var5] + "-" + var6;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7940[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class559(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field7934 = arg0;
         this.field7933 = arg1;
         this.field7931 = arg2;
         this.field7932 = arg3;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7940[5] + arg0 + ',' + (arg1 != null ? field7940[6] : field7940[4]) + ',' + (arg2 != null ? field7940[6] : field7940[4]) + ',' + (arg3 != null ? field7940[6] : field7940[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4159(int arg0) {
      try {
         class585.field8203 = -1;
         class793.field11537 = 1;
         class527.field7461 = class745.field10604;
         if (arg0 >= 80) {
            ++field7930;
            String var1 = null;
            if (class436.field6382 != null) {
               class65 var2 = new class65(class436.field6382);
               var1 = class29.method363(var2.method680(-129), 37);
               class396.field5869 = var2.method680(-129);
            }

            if (var1 == null) {
               class547.method4096(35, (byte)-107);
            } else {
               class216.method1867("", true, false, 0, var1);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7940[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "<init>",
      descriptor = "()V"
   )
   protected class559() {
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4160(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4161(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4162(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
