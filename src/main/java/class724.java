import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class724 extends class294 {
   @OriginalMember(
      owner = "client!cfa",
      name = "m",
      descriptor = "I"
   )
   private int field10828;
   @OriginalMember(
      owner = "client!cfa",
      name = "r",
      descriptor = "I"
   )
   private int field10837;
   @OriginalMember(
      owner = "client!cfa",
      name = "v",
      descriptor = "I"
   )
   public int field10834;
   @OriginalMember(
      owner = "client!cfa",
      name = "t",
      descriptor = "I"
   )
   public int field10831;
   @OriginalMember(
      owner = "client!cfa",
      name = "s",
      descriptor = "I"
   )
   private int field10840;
   @OriginalMember(
      owner = "client!cfa",
      name = "y",
      descriptor = "I"
   )
   public int field10841;
   @OriginalMember(
      owner = "client!cfa",
      name = "q",
      descriptor = "I"
   )
   private int field10826;
   @OriginalMember(
      owner = "client!cfa",
      name = "D",
      descriptor = "I"
   )
   public int field10833;
   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "I"
   )
   private int field10836;
   @OriginalMember(
      owner = "client!cfa",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10845 = new String[]{method5357(method5356(":w'S!q")), method5357(method5356("\"?hS\u001e")), method5357(method5356("7d*\u0011")), method5357(method5356(":w'S%q")), method5357(method5356(":w'S$q")), method5357(method5356(":w'S_0\u007f/\t]q")), method5357(method5356(":w'S'q")), method5357(method5356(":w'S\"q")), method5357(method5356("yP%\t\n/t|]")), method5357(method5356(",b")), method5357(method5356("\u0016r%\u0011\u0016=tf>\u00025rf)\f6z|]")), method5357(method5356("yA/\u0005\u00065b|]")), method5357(method5356("yF'\u0011\u000f*+f")), method5357(method5356("\r~2\u001c\u000fyE4\u001c\r*1\t\u0013\u0010:c#\u0018\rc1")), method5357(method5356("\u0016r%\u0011\u0016=t4\u000eYy")), method5357(method5356("\u0016r%\u0011\u0016=t\"GC\u001ec)\b\r=+")), method5357(method5356("\u001dh(\u001c\u000e0r|]")), method5357(method5356("yR\u0016\u000eYy")), method5357(method5356("\r~2\u001c\u000fy^6\u001c\u0012,tf2\r*r4\u0018\u00067+f")), method5357(method5356(":w'S q")), method5357(method5356(":w'S+q"))};
   @OriginalMember(
      owner = "client!cfa",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field10843 = false;
   @OriginalMember(
      owner = "client!cfa",
      name = "A",
      descriptor = "I"
   )
   public static int field10827;
   @OriginalMember(
      owner = "client!cfa",
      name = "p",
      descriptor = "I"
   )
   public static int field10829;
   @OriginalMember(
      owner = "client!cfa",
      name = "E",
      descriptor = "I"
   )
   public static int field10830;
   @OriginalMember(
      owner = "client!cfa",
      name = "u",
      descriptor = "I"
   )
   public static int field10832;
   @OriginalMember(
      owner = "client!cfa",
      name = "n",
      descriptor = "I"
   )
   public static int field10835;
   @OriginalMember(
      owner = "client!cfa",
      name = "w",
      descriptor = "I"
   )
   public static int field10838;
   @OriginalMember(
      owner = "client!cfa",
      name = "C",
      descriptor = "I"
   )
   public static int field10839;
   @OriginalMember(
      owner = "client!cfa",
      name = "o",
      descriptor = "I"
   )
   public static int field10842;
   @OriginalMember(
      owner = "client!cfa",
      name = "B",
      descriptor = "I"
   )
   public static int field10844;

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(IIBIIIIIII)V"
   )
   public static final void method5348(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field1786;

      try {
         ++field10830;
         if (~arg0 <= -513 && ~arg1 <= -513 && ~(class513.field7828 * 512 + -1024) <= ~arg0 && ~(class475.field7230 * 512 + -1024) <= ~arg1) {
            int var11;
            label42: {
               var11 = -arg4 + class477.method3711(arg7, arg0, (byte)0, arg1);
               if (class281.field4472) {
                  class176.method1615(true, (byte)-96);
                  if (!var10) {
                     break label42;
                  }
               }

               class187.field2925.method1546(arg9, 0, 0);
               class351.field5356.method688(class187.field2925);
            }

            label37: {
               if (!class334.field5143) {
                  class351.field5356.method700(arg0, var11, arg1, class532.field8077);
                  if (!var10) {
                     break label37;
                  }
               }

               class351.field5356.method582(arg0, var11, arg1, class591.field8709, class532.field8077);
            }

            if (arg2 <= -88) {
               if (!class281.field4472) {
                  class187.field2925.method1546(-arg9, 0, 0);
                  class351.field5356.method688(class187.field2925);
               } else {
                  class442.method3481(72);
               }
            }
         } else {
            class532.field8077[0] = class532.field8077[1] = -1;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10845[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "b",
      descriptor = "(IIII)Z"
   )
   public final boolean method5349(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10827;
         if (arg2 != 105) {
            return true;
         } else {
            return this.field10826 == arg3 && ~this.field10836 >= ~arg0 && this.field10828 >= arg0 && ~this.field10840 >= ~arg1 && this.field10837 >= arg1;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10845[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "()V"
   )
   public static final void method5350() {
      byte var0 = 10;
      byte var1 = 30;
      if (class454.field6948 != 0 && class451.field6894 != null) {
         class546.field8193.method626(class344.field5273);

         for(int var2 = 0; var2 < class277.field4418.length; ++var2) {
            class546.field8193.method4492(class277.field4418[var2] + class222.field3346[var2], class344.field5273[1], class344.field5273[3] - class344.field5273[1], -256, (byte)-36);
         }

         for(int var3 = 0; var3 < class717.field10736; ++var3) {
            class409 var11 = class366.field5665[var3];
            class546.field8193.method600(var11.field6364[0], var11.field6372[0], var11.field6368[0], class507.field7761);
            class546.field8193.method600(var11.field6364[1], var11.field6372[1], var11.field6368[1], class708.field10662);
            class546.field8193.method600(var11.field6364[2], var11.field6372[2], var11.field6368[2], class106.field1468);
            class546.field8193.method600(var11.field6364[3], var11.field6372[3], var11.field6368[3], class382.field6033);
            if (class507.field7761[2] != -1 && class708.field10662[2] != -1 && class106.field1468[2] != -1 && class382.field6033[2] != -1) {
               int var12 = -65536;
               if (var11.field6375 == 4) {
                  var12 = -16776961;
               }

               class546.field8193.method4497(var12, class708.field10662[0], 1, class708.field10662[1], class507.field7761[1], class507.field7761[0]);
               class546.field8193.method4497(var12, class106.field1468[0], 1, class106.field1468[1], class708.field10662[1], class708.field10662[0]);
               class546.field8193.method4497(var12, class382.field6033[0], 1, class382.field6033[1], class106.field1468[1], class106.field1468[0]);
               class546.field8193.method4497(var12, class507.field7761[0], 1, class507.field7761[1], class382.field6033[1], class382.field6033[0]);
               class546.field8193.method4497(var12, class106.field1468[0], 1, class106.field1468[1], class507.field7761[1], class507.field7761[0]);
            }
         }

         class451.field6894.method2414(var1 + 45, var0, field10845[16] + class108.field1485 + "/" + 5000, true, -256, -16777216);
         class451.field6894.method2414(var1 + 60, var0, field10845[18] + class711.field10690 + "/" + 10000, true, -256, -16777216);
         class451.field6894.method2414(var1 + 75, var0, field10845[13] + class127.field1832 + "/" + 5000, true, -256, -16777216);
         class451.field6894.method2414(var1 + 90, var0, field10845[14] + (class410.field6383 + class292.field4635) + field10845[8] + class717.field10736, true, -256, -16777216);
         class451.field6894.method2414(var1 + 105, var0, field10845[15] + class200.field3071 + field10845[12] + class269.field4362 + field10845[17] + class467.field7105 + field10845[11] + class84.field1223, true, -256, -16777216);
         class451.field6894.method2414(var1 + 120, var0, field10845[10] + class125.field1800 / 1000L + field10845[9], true, -256, -16777216);
         if (class454.field6948 == 2 && class327.field4984 != null) {
            for(int var4 = 0; var4 < class327.field4984.length; ++var4) {
               float var6 = (float)class327.field4984[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class327.field4984[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class672 var5 = class546.field8193.method4494((byte)112, class105.field1456, class211.field3196, class211.field3196, 0, class327.field4984);
            var5.method938(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method5351(int arg0, int arg1, int arg2) {
      try {
         ++field10829;
         if (arg1 < 52) {
            this.field10826 = 41;
         }

         return arg2 >= this.field10833 && arg2 <= this.field10841 && ~this.field10834 >= ~arg0 && ~arg0 >= ~this.field10831;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10845[19] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "b",
      descriptor = "(III)Z"
   )
   public final boolean method5352(int arg0, int arg1, int arg2) {
      try {
         if (arg1 > -98) {
            this.field10841 = 20;
         }

         ++field10835;
         return this.field10836 <= arg2 && ~arg2 >= ~this.field10828 && ~this.field10840 >= ~arg0 && this.field10837 >= arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10845[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(II[II)V"
   )
   public final void method5353(int arg0, int arg1, int[] arg2, int arg3) {
      try {
         ++field10839;
         arg2[0] = this.field10826;
         if (arg0 < -66) {
            arg2[1] = this.field10836 - (this.field10833 - arg3);
            arg2[2] = -this.field10834 - (-this.field10840 - arg1);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10845[20] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10845[1] : field10845[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "(IIIIIIIII)V"
   )
   public class724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field10828 = arg3;
         this.field10837 = arg4;
         this.field10834 = arg6;
         this.field10831 = arg8;
         this.field10840 = arg2;
         this.field10841 = arg7;
         this.field10826 = arg0;
         this.field10833 = arg5;
         this.field10836 = arg1;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field10845[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method5354(int arg0, byte arg1) {
      try {
         ++field10842;
         int var2 = 101 % ((-3 - arg1) / 34);
         return arg0 >>> 8;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10845[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(ZI[II)V"
   )
   public final void method5355(boolean arg0, int arg1, int[] arg2, int arg3) {
      try {
         arg2[0] = 0;
         ++field10844;
         arg2[2] = -this.field10840 + this.field10834 + arg3;
         if (!arg0) {
            this.method5352(-69, 42, 53);
         }

         arg2[1] = this.field10833 + arg1 - this.field10836;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10845[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10845[1] : field10845[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5356(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5357(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
