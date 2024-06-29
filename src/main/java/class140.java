import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class140 {
   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "Loi;"
   )
   private class80 field1789 = new class80(64);
   @OriginalMember(
      owner = "client!fg",
      name = "m",
      descriptor = "Lkf;"
   )
   private class266 field1787;
   @OriginalMember(
      owner = "client!fg",
      name = "g",
      descriptor = "Ldg;"
   )
   public class436 field1793;
   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1794 = new String[]{method1115(method1114("=uX\u0003{")), method1115(method1114("=uX\u0004{")), method1115(method1114("=uX\u0005{")), method1115(method1114("5g\u001a*")), method1115(method1114("=uX\u0001{")), method1115(method1114(" <Xh.")), method1115(method1114("=uXz:5{\u0002x{")), method1115(method1114("=uX\u000e{")), method1115(method1114("=uX\u0000{")), method1115(method1114("=uX\u0002{")), method1115(method1114("=uX\u0007{"))};
   @OriginalMember(
      owner = "client!fg",
      name = "h",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field1790 = new BigInteger(method1115(method1114("j\"Fvb")), 16);
   @OriginalMember(
      owner = "client!fg",
      name = "n",
      descriptor = "I"
   )
   public static int field1791 = -1;
   @OriginalMember(
      owner = "client!fg",
      name = "o",
      descriptor = "I"
   )
   public static int field1779;
   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "I"
   )
   public static int field1780;
   @OriginalMember(
      owner = "client!fg",
      name = "i",
      descriptor = "I"
   )
   public static int field1781;
   @OriginalMember(
      owner = "client!fg",
      name = "d",
      descriptor = "I"
   )
   public static int field1783;
   @OriginalMember(
      owner = "client!fg",
      name = "f",
      descriptor = "I"
   )
   public static int field1784;
   @OriginalMember(
      owner = "client!fg",
      name = "e",
      descriptor = "I"
   )
   public static int field1785;
   @OriginalMember(
      owner = "client!fg",
      name = "l",
      descriptor = "I"
   )
   public static int field1786;
   @OriginalMember(
      owner = "client!fg",
      name = "j",
      descriptor = "I"
   )
   public static int field1788;
   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "I"
   )
   public static int field1792;
   @OriginalMember(
      owner = "client!fg",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field1782;

   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public final void method1106(int arg0) {
      try {
         if (arg0 <= 23) {
            this.method1112(-115);
         }

         class80 var2 = this.field1789;
         synchronized(this.field1789) {
            this.field1789.method715(true);
         }

         ++field1780;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1794[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(Ljava/lang/Object;III)[B",
      line = 19
   )
   public static final byte[] method1107(Object arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg2 < 89) {
            return null;
         } else {
            ++field1786;
            if (arg0 == null) {
               return null;
            } else if (arg0 instanceof byte[]) {
               byte[] var4 = (byte[])arg0;
               return class649.method4730(arg3, (byte)-36, var4, arg1);
            } else if (arg0 instanceof class361) {
               class361 var5 = (class361)arg0;
               return var5.method2312(arg1, (byte)127, arg3);
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1794[4] + (arg0 != null ? field1794[5] : field1794[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IZ)Lje;",
      line = 51
   )
   public final class425 method1108(int arg0, boolean arg1) {
      try {
         ++field1781;
         class80 var3 = this.field1789;
         class425 var4;
         synchronized(this.field1789) {
            var4 = (class425)this.field1789.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field1787;
            byte[] var6;
            synchronized(this.field1787) {
               var6 = this.field1787.method2037(arg1, arg0, 32);
            }

            class425 var7 = new class425();
            var7.field6090 = this;
            if (var6 != null) {
               var7.method3147(new class147(var6), (byte)106);
            }

            class80 var8 = this.field1789;
            synchronized(this.field1789) {
               this.field1789.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1794[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IB)V",
      line = 82
   )
   public final void method1109(int arg0, byte arg1) {
      try {
         ++field1779;
         class80 var3 = this.field1789;
         synchronized(this.field1789) {
            if (arg1 <= -38) {
               this.field1789.method726(arg0, 25324);
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1794[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(II)I",
      line = 95
   )
   public static final int method1110(int arg0, int arg1) {
      try {
         if (arg1 != 255) {
            field1788 = -61;
         }

         ++field1785;
         return 255 & arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1794[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(I)V",
      line = 108
   )
   public static void method1111(int arg0) {
      try {
         if (arg0 < 61) {
            field1790 = null;
         }

         field1790 = null;
         field1782 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1794[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "(I)V",
      line = 120
   )
   public final void method1112(int arg0) {
      try {
         class80 var2 = this.field1789;
         synchronized(this.field1789) {
            int var3 = -10 % ((arg0 - 1) / 46);
            this.field1789.method731(0);
         }

         ++field1783;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1794[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 136
   )
   public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4360;

      try {
         ++field1784;
         int var9 = class298.method2224(arg2, class245.field3374, class699.field10237, -250);
         int var10 = class298.method2224(arg0, class245.field3374, class699.field10237, -250);
         int var11 = class298.method2224(arg1, class457.field6528, class348.field4702, -250);
         int var12 = class298.method2224(arg7, class457.field6528, class348.field4702, -250);
         int var13 = class298.method2224(arg2 + arg3, class245.field3374, class699.field10237, -250);
         int var14 = class298.method2224(-arg3 + arg0, class245.field3374, class699.field10237, -250);
         int var15 = var9;
         if (var8) {
            class149.method1249(-7, var11, arg6, class341.field4631[var9], var12);
            var15 = var9 + 1;
         }

         while(true) {
            int var10000;
            int var10001;
            if (~var15 <= ~var13) {
               int var16 = var10;
               var10000 = arg4;
               var10001 = 16;
               if (!var8) {
                  if (arg4 != 16) {
                     field1782 = null;
                     if (var8) {
                        class149.method1249(-7, var11, arg6, class341.field4631[var10], var12);
                        var16 = var10 - 1;
                     }
                  }

                  while(true) {
                     while(var14 < var16) {
                        class149.method1249(-7, var11, arg6, class341.field4631[var16], var12);
                        --var16;
                     }

                     int var17 = class298.method2224(arg1 + arg3, class457.field6528, class348.field4702, -250);
                     int var18 = class298.method2224(arg7 - arg3, class457.field6528, class348.field4702, arg4 + -266);
                     int var19 = var13;
                     if (!var8) {
                        if (!var8 && ~var14 > ~var13) {
                           return;
                        }

                        do {
                           int[] var20 = class341.field4631[var19];
                           class149.method1249(-7, var11, arg6, var20, var17);
                           class149.method1249(-7, var17, arg5, var20, var18);
                           class149.method1249(-7, var18, arg6, var20, var12);
                           ++var19;
                        } while(~var14 <= ~var19);

                        return;
                     }

                     --var16;
                  }
               }
            } else {
               var10000 = -7;
               var10001 = var11;
            }

            class149.method1249(var10000, var10001, arg6, class341.field4631[var15], var12);
            ++var15;
         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field1794[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "<init>",
      descriptor = "(Lno;ILkf;Ldg;)V",
      line = 202
   )
   public class140(class732 arg0, int arg1, class266 arg2, class436 arg3) {
      try {
         this.field1787 = arg2;
         this.field1787.method2060(2, 32);
         this.field1793 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1794[6] + (arg0 != null ? field1794[5] : field1794[3]) + ',' + arg1 + ',' + (arg2 != null ? field1794[5] : field1794[3]) + ',' + (arg3 != null ? field1794[5] : field1794[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1114(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1115(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
