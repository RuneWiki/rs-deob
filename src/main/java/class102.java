import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class102 extends class354 {
   @OriginalMember(
      owner = "client!pfa",
      name = "Xb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1436 = new String[]{method1000(method999("6\u000f*/Qn")), method1000(method999("(\u001c'm")), method1000(method999("=Ge/e")), method1000(method999("6\u000f*/\\n")), method1000(method999("6\u000f*/^n")), method1000(method999("6\u000f*/Tn")), method1000(method999("6\u000f*/Yn")), method1000(method999("6\u000f*/Vn")), method1000(method999("6\u000f*/Pn")), method1000(method999("6\u000f*/Un")), method1000(method999("6\u000f*/Sn")), method1000(method999("6\u000f*/[n")), method1000(method999("6\u000f*/Rn")), method1000(method999("6\u000f*/_n")), method1000(method999("6\u000f*/]n")), method1000(method999("6\u000f*/Zn"))};
   @OriginalMember(
      owner = "client!pfa",
      name = "Tb",
      descriptor = "I"
   )
   public static int field1420;
   @OriginalMember(
      owner = "client!pfa",
      name = "Qb",
      descriptor = "I"
   )
   public static int field1421;
   @OriginalMember(
      owner = "client!pfa",
      name = "Ib",
      descriptor = "I"
   )
   public static int field1422;
   @OriginalMember(
      owner = "client!pfa",
      name = "Sb",
      descriptor = "I"
   )
   public static int field1424;
   @OriginalMember(
      owner = "client!pfa",
      name = "Jb",
      descriptor = "I"
   )
   public static int field1425;
   @OriginalMember(
      owner = "client!pfa",
      name = "Ub",
      descriptor = "I"
   )
   public static int field1426;
   @OriginalMember(
      owner = "client!pfa",
      name = "Lb",
      descriptor = "I"
   )
   public static int field1427;
   @OriginalMember(
      owner = "client!pfa",
      name = "Pb",
      descriptor = "I"
   )
   public static int field1428;
   @OriginalMember(
      owner = "client!pfa",
      name = "Ob",
      descriptor = "I"
   )
   public static int field1429;
   @OriginalMember(
      owner = "client!pfa",
      name = "Rb",
      descriptor = "I"
   )
   public static int field1430;
   @OriginalMember(
      owner = "client!pfa",
      name = "Hb",
      descriptor = "I"
   )
   private int field1431;
   @OriginalMember(
      owner = "client!pfa",
      name = "Vb",
      descriptor = "I"
   )
   public static int field1432;
   @OriginalMember(
      owner = "client!pfa",
      name = "Kb",
      descriptor = "I"
   )
   public static int field1433;
   @OriginalMember(
      owner = "client!pfa",
      name = "Mb",
      descriptor = "I"
   )
   public static int field1435;
   @OriginalMember(
      owner = "client!pfa",
      name = "Wb",
      descriptor = "Lmfa;"
   )
   public static class158 field1434;
   @OriginalMember(
      owner = "client!pfa",
      name = "Nb",
      descriptor = "Lce;"
   )
   private class378 field1423;

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "([II)V"
   )
   public final void method985(int[] arg0, int arg1) {
      try {
         ++field1428;
         this.field1423 = new class378(arg0);
         if (arg1 != 1) {
            this.field1423 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[15] + (arg0 != null ? field1436[2] : field1436[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "A",
      descriptor = "(I)V"
   )
   public final void method986(int arg0) {
      try {
         super.field5436 = (this.field1431 + 7) / arg0;
         ++field1432;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1436[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Lfq;B)V"
   )
   public static final void method987(class374 arg0, byte arg1) {
      try {
         if (arg1 != 68) {
            field1434 = null;
         }

         ++field1430;
         if (class258.field3981 == arg0.field5917) {
            if (class476.field7251.field67 == null) {
               arg0.field5828 = 0;
               arg0.field5822 = 0;
            } else {
               arg0.field5918 = 150;
               arg0.field5894 = 2047 & (int)(256.0D * Math.sin((double)class308.field4801 / 40.0D));
               arg0.field5822 = class315.field4864;
               arg0.field5825 = 5;
               arg0.field5828 = class126.method1191(class476.field7251.field67, 65);
               class366 var2 = class476.field7251.field1616;
               if (var2 != null) {
                  if (arg0.field5937 == null) {
                     arg0.field5937 = new class286();
                  }

                  arg0.field5897 = var2.method2995((byte)104);
                  arg0.field5937.method2986(var2, (byte)-67);
               } else {
                  arg0.field5937 = null;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[11] + (arg0 != null ? field1436[2] : field1436[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "e",
      descriptor = "(BI)I"
   )
   public final int method988(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != -116) {
            return -90;
         } else {
            ++field1429;
            int var4 = this.field1431 >> 3;
            int var5 = -(this.field1431 & 7) + 8;
            this.field1431 += arg1;
            int var6 = 0;
            if (var3) {
               var6 += (super.field5428[var4++] & class178.field2777[var5]) << arg1 - var5;
               arg1 -= var5;
               var5 = 8;
            }

            while(true) {
               while(arg1 > var5) {
                  var6 += (super.field5428[var4++] & class178.field2777[var5]) << arg1 - var5;
                  arg1 -= var5;
                  var5 = 8;
               }

               if (!var3) {
                  if (arg1 != var5) {
                     var6 += super.field5428[var4] >> -arg1 + var5 & class178.field2777[arg1];
                     if (!var3) {
                        return var6;
                     }
                  }

                  var6 += class178.field2777[var5] & super.field5428[var4];
                  return var6;
               }

               arg1 -= var5;
               var5 = 8;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1436[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "n",
      descriptor = "(II)I"
   )
   public final int method989(int arg0, int arg1) {
      try {
         ++field1421;
         if (arg1 != -13053) {
            field1434 = null;
         }

         return arg0 * 8 + -this.field1431;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "y",
      descriptor = "(I)I"
   )
   public final int method990(int arg0) {
      try {
         ++field1422;
         int var2 = 255 & super.field5428[super.field5436++] - this.field1423.method3091(15072);
         int var3 = 80 / ((-91 - arg0) / 32);
         return ~var2 > -129 ? var2 : (255 & super.field5428[super.field5436++] + -this.field1423.method3091(15072)) + (var2 + -128 << 8);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1436[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "e",
      descriptor = "(Z)V"
   )
   public static void method991(boolean arg0) {
      try {
         field1434 = null;
         if (!arg0) {
            field1434 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1436[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Lce;B)V"
   )
   public final void method992(class378 arg0, byte arg1) {
      try {
         this.field1423 = arg0;
         if (arg1 == 29) {
            ++field1425;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[0] + (arg0 != null ? field1436[2] : field1436[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method993(int param1, int param2, byte[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class102(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(I)V"
   )
   public final void method994(int arg0) {
      try {
         ++field1424;
         if (arg0 == -19645) {
            this.field1431 = super.field5436 * 8;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1436[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Ljava/lang/String;BIZLjava/lang/String;)V"
   )
   public static final void method995(String arg0, byte arg1, int arg2, boolean arg3, String arg4) {
      try {
         ++field1420;
         class234.method2011(arg3, 1, -1, arg4, arg0, true, arg2);
         if (arg1 > -72) {
            method995((String)null, (byte)-53, 51, true, (String)null);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1436[13] + (arg0 != null ? field1436[2] : field1436[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1436[2] : field1436[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "x",
      descriptor = "(I)Z"
   )
   public final boolean method996(int arg0) {
      try {
         ++field1427;
         int var2 = super.field5428[super.field5436] - this.field1423.method3089((byte)-18) & 255;
         if (var2 < 128) {
            return false;
         } else {
            return arg0 <= -124;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "m",
      descriptor = "(II)V"
   )
   public final void method997(int arg0, int arg1) {
      try {
         ++field1426;
         if (arg0 < 7) {
            this.method992((class378)null, (byte)59);
         }

         super.field5428[super.field5436++] = (byte)(this.field1423.method3091(15072) + arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(I[Ljava/awt/Rectangle;I)V"
   )
   public static final void method998(int arg0, Rectangle[] arg1, int arg2) throws class623 {
      try {
         label27: {
            ++field1435;
            if (class67.field883 != 1) {
               class450.field6888.method593(arg1, arg0, 0, 0);
               if (!client.field1786) {
                  break label27;
               }
            }

            class450.field6888.method593(arg1, arg0, class656.field9793, class177.field2773);
         }

         if (arg2 <= 91) {
            field1434 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1436[14] + arg0 + ',' + (arg1 != null ? field1436[2] : field1436[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method999(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1000(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
