import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class176 extends class70 {
   @OriginalMember(
      owner = "client!hd",
      name = "H",
      descriptor = "[S"
   )
   private short[] field2759 = new short[257];
   @OriginalMember(
      owner = "client!hd",
      name = "K",
      descriptor = "I"
   )
   private int field2766 = 0;
   @OriginalMember(
      owner = "client!hd",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2772 = new String[]{method1617(method1616("D5\u001e\u001b\u001a")), method1617(method1616("D5\u001e\u0017\u001a")), method1617(method1616("D5\u001e\u0018\u001a")), method1617(method1616("D5\u001e\u0019\u001a")), method1617(method1616("D5\u001e\u001d\u001a")), method1617(method1616("D5\u001e\u0015\u001a")), method1617(method1616("W\u007f\u001erO")), method1617(method1616("B$\\0")), method1617(method1616("D5\u001e\u0014\u001a")), method1617(method1616("D5\u001e\u001f\u001a")), method1617(method1616("D5\u001e\u001a\u001a")), method1617(method1616("D5\u001e\u001e\u001a")), method1617(method1616("o$B*W\f>@9@M%Y3\\\f#U-GE#U/\u0012M%\u00100WM\"D|F[>\u00101S^:U.A"))};
   @OriginalMember(
      owner = "client!hd",
      name = "Q",
      descriptor = "Z"
   )
   public static boolean field2762 = false;
   @OriginalMember(
      owner = "client!hd",
      name = "U",
      descriptor = "I"
   )
   public static int field2763 = -1;
   @OriginalMember(
      owner = "client!hd",
      name = "N",
      descriptor = "Z"
   )
   public static boolean field2769 = false;
   @OriginalMember(
      owner = "client!hd",
      name = "S",
      descriptor = "I"
   )
   public static int field2754;
   @OriginalMember(
      owner = "client!hd",
      name = "F",
      descriptor = "I"
   )
   public static int field2756;
   @OriginalMember(
      owner = "client!hd",
      name = "P",
      descriptor = "I"
   )
   public static int field2757;
   @OriginalMember(
      owner = "client!hd",
      name = "T",
      descriptor = "I"
   )
   public static int field2758;
   @OriginalMember(
      owner = "client!hd",
      name = "R",
      descriptor = "I"
   )
   public static int field2760;
   @OriginalMember(
      owner = "client!hd",
      name = "O",
      descriptor = "I"
   )
   public static int field2761;
   @OriginalMember(
      owner = "client!hd",
      name = "M",
      descriptor = "I"
   )
   public static int field2765;
   @OriginalMember(
      owner = "client!hd",
      name = "J",
      descriptor = "I"
   )
   public static int field2768;
   @OriginalMember(
      owner = "client!hd",
      name = "W",
      descriptor = "I"
   )
   public static int field2770;
   @OriginalMember(
      owner = "client!hd",
      name = "G",
      descriptor = "[I"
   )
   private int[] field2755;
   @OriginalMember(
      owner = "client!hd",
      name = "L",
      descriptor = "[I"
   )
   private int[] field2764;
   @OriginalMember(
      owner = "client!hd",
      name = "V",
      descriptor = "[[I"
   )
   private int[][] field2767;
   @OriginalMember(
      owner = "client!hd",
      name = "X",
      descriptor = "[[[S"
   )
   public static short[][][] field2771;

   @OriginalMember(
      owner = "client!hd",
      name = "g",
      descriptor = "(I)V",
      line = 4
   )
   public static final void method1609(int arg0) {
      try {
         label20: {
            ++field2761;
            if (class714.field10713 > 1) {
               class687.field10213.method299(-17, 4, class687.field10213.field521);
               if (!client.field1786) {
                  break label20;
               }
            }

            class687.field10213.method299(-17, 2, class687.field10213.field521);
         }

         if (arg0 > -68) {
            field2763 = 38;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2772[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "(Z)V",
      line = 28
   )
   private final void method1610(boolean arg0) {
      try {
         ++field2770;
         int[] var2 = this.field2767[0];
         int[] var3 = this.field2767[1];
         int[] var4 = this.field2767[this.field2767.length + -2];
         int[] var5 = this.field2767[this.field2767.length - 1];
         this.field2755 = new int[]{var4[0] - -var4[0] + -var5[0], var4[1] - (-var4[1] - -var5[1])};
         if (!arg0) {
            field2762 = true;
         }

         this.field2764 = new int[]{var2[0] + var2[0] + -var3[0], var2[1] + var2[1] + -var3[1]};
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2772[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "c",
      descriptor = "(Z)V",
      line = 48
   )
   private final void method1611(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hd",
      name = "<init>",
      descriptor = "()V",
      line = 412
   )
   public class176() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!hd",
      name = "i",
      descriptor = "(I)V",
      line = 236
   )
   public static void method1612(int arg0) {
      try {
         int var1 = -21 / ((21 - arg0) / 39);
         field2771 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2772[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "h",
      descriptor = "(I)V",
      line = 247
   )
   public static final void method1613(int arg0) {
      try {
         class429.field6629.method5389(0);
         ++field2768;
         class29.field347.method5489(1);
         class738.field10964.method3782((byte)-128);
         class102.field1434.method1413(30);
         class412.field6401.method792(arg0 ^ -100);
         class247.field3763.method2053(120);
         class314.field4861.method4839((byte)-97);
         class317.field4896.method1649((byte)-2);
         class228.field3467.method1035(arg0);
         class479.field7291.method500(-10);
         class750.field11119.method3164(0);
         class750.field11116.method3450((byte)126);
         class252.field3808.method106((byte)-121);
         class230.field3520.method4013(arg0 + -31541);
         class508.field7776.method130(0);
         class293.field4644.method982(2);
         class610.field8879.method176(arg0 ^ -17003);
         class739.field10975.method3604(arg0 + 105);
         class88.field1274.method2033(false);
         class342.field5201.method1144((byte)-115);
         class581.field8578.method5192(true);
         class649.field9349.method5138(-29881);
         class523.field7971.method1779(113);
         class615.method4526(-2);
         class467.method3625((byte)99);
         class747.method5487((byte)124);
         class795.method5741((byte)10);
         class750.method5510((byte)-88);
         class86.field1261.method2554(-98);
         class97.field1358.method2554(arg0 ^ -124);
         class384.field6050.method2554(-110);
         class355.field5443.method2554(arg0 + -110);
         class469.field7131.method2554(arg0 + -108);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2772[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(BI)[I",
      line = 294
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2756;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int[] var5 = this.method545(0, arg1, (byte)-125);
            int var6 = 0;
            if (var3 || var6 < class678.field10127) {
               do {
                  int var7 = var5[var6] >> 4;
                  if (~var7 > -1) {
                     var7 = 0;
                  }

                  if (var7 > 256) {
                     var7 = 256;
                  }

                  var4[var6] = this.field2759[var7];
                  ++var6;
               } while(var6 < class678.field10127);
            }
         }

         if (arg0 != 87) {
            field2762 = true;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2772[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(Z)V",
      line = 336
   )
   public final void method275(boolean arg0) {
      try {
         ++field2758;
         if (this.field2767 == null) {
            this.field2767 = new int[][]{new int[2], {4096, 4096}};
         }

         if (arg0) {
            this.field2766 = 122;
         }

         if (~this.field2767.length > -3) {
            throw new RuntimeException(field2772[12]);
         } else {
            if (~this.field2766 == -3) {
               this.method1610(true);
            }

            class452.method3548((byte)-119);
            this.method1611(!arg0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2772[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(IILica;)V",
      line = 358
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg1 == 0) {
            this.field2766 = arg2.method2855(-31007);
            this.field2767 = new int[arg2.method2855(-31007)][2];
            int var5 = 0;
            if (var4 || var5 < this.field2767.length) {
               do {
                  this.field2767[var5][0] = arg2.method2848(-95);
                  this.field2767[var5][1] = arg2.method2848(-123);
                  ++var5;
               } while(var5 < this.field2767.length);
            }
         }

         ++field2760;
         if (arg0 != -1) {
            this.field2767 = null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2772[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2772[6] : field2772[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "(II)[I",
      line = 385
   )
   private final int[] method1614(int arg0, int arg1) {
      try {
         int var3 = 54 / ((arg1 - 30) / 58);
         ++field2757;
         if (~arg0 > -1) {
            return this.field2764;
         } else {
            return ~arg0 <= ~this.field2767.length ? this.field2755 : this.field2767[arg0];
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2772[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(ZB)V",
      line = 415
   )
   public static final void method1615(boolean arg0, byte arg1) {
      try {
         ++field2754;
         class640.field9279.method1549(class450.field6888.method605());
         if (arg1 != -96) {
            method1613(-8);
         }

         int[] var2 = class450.field6888.method669();
         class650.field9376 = var2[0];
         class541.field8160 = var2[3];
         class27.field328 = var2[1];
         class724.field10832 = var2[2];
         if (!arg0) {
            class450.field6888.method639(class620.field9021, class4.field18, class341.field5190, class658.field9838);
            class430.method3402(class37.field452, -114);
         } else {
            class450.field6888.method639(class95.field1334, class727.field10857, class395.field6189, class740.field11007);
            class430.method3402(class775.field11387, arg1 + 219);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2772[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
