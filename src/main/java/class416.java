import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class416 extends class606 {
   @OriginalMember(
      owner = "client!ne",
      name = "E",
      descriptor = "I"
   )
   private int field6089 = 0;
   @OriginalMember(
      owner = "client!ne",
      name = "J",
      descriptor = "[S"
   )
   private short[] field6092 = new short[257];
   @OriginalMember(
      owner = "client!ne",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6101 = new String[]{method3256(method3255("X\u007f,y\u000f")), method3256(method3255("X\u007f,t\u000f")), method3256(method3255("X\u007f,v\u000f")), method3256(method3255("X\u007f,z\u000f")), method3256(method3255("uopGB\u0016urTUWnk^I\u0016hg@R_hgB\u0007Wn\"]BWiv\u0011SAu\"\\FDqgCT")), method3256(method3255("X\u007f,{\u000f")), method3256(method3255("X\u007f,x\u000f")), method3256(method3255("M4,\u001fZ")), method3256(method3255("Xon]")), method3256(method3255("X\u007f,p\u000f")), method3256(method3255("X\u007f,r\u000f"))};
   @OriginalMember(
      owner = "client!ne",
      name = "H",
      descriptor = "Lrg;"
   )
   public static class167 field6085;
   @OriginalMember(
      owner = "client!ne",
      name = "M",
      descriptor = "Lrg;"
   )
   public static class167 field6098 = field6085 = new class167(false);
   @OriginalMember(
      owner = "client!ne",
      name = "O",
      descriptor = "I"
   )
   public static int field6100 = -1;
   @OriginalMember(
      owner = "client!ne",
      name = "F",
      descriptor = "[[Z"
   )
   public static boolean[][] field6099 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
   @OriginalMember(
      owner = "client!ne",
      name = "R",
      descriptor = "I"
   )
   public static int field6086;
   @OriginalMember(
      owner = "client!ne",
      name = "T",
      descriptor = "I"
   )
   public static int field6088;
   @OriginalMember(
      owner = "client!ne",
      name = "Q",
      descriptor = "I"
   )
   public static int field6090;
   @OriginalMember(
      owner = "client!ne",
      name = "S",
      descriptor = "I"
   )
   public static int field6091;
   @OriginalMember(
      owner = "client!ne",
      name = "K",
      descriptor = "I"
   )
   public static int field6093;
   @OriginalMember(
      owner = "client!ne",
      name = "D",
      descriptor = "I"
   )
   public static int field6096;
   @OriginalMember(
      owner = "client!ne",
      name = "N",
      descriptor = "I"
   )
   public static int field6097;
   @OriginalMember(
      owner = "client!ne",
      name = "L",
      descriptor = "[I"
   )
   private int[] field6087;
   @OriginalMember(
      owner = "client!ne",
      name = "I",
      descriptor = "[I"
   )
   private int[] field6094;
   @OriginalMember(
      owner = "client!ne",
      name = "G",
      descriptor = "[[I"
   )
   private int[][] field6095;

   @OriginalMember(
      owner = "client!ne",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3250(int arg0) {
      try {
         if (arg0 != 25257) {
            method3254((byte)-11);
         }

         field6085 = null;
         field6098 = null;
         field6099 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6101[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field6097;
         if (arg1 == 0) {
            this.field6089 = arg0.method665(false);
            this.field6095 = new int[arg0.method665(false)][2];
            int var5 = 0;
            if (var4 || ~this.field6095.length < ~var5) {
               do {
                  this.field6095[var5][0] = arg0.method685(-2);
                  this.field6095[var5][1] = arg0.method685(-2);
                  ++var5;
               } while(~this.field6095.length < ~var5);
            }
         }

         if (arg2 > -6) {
            field6098 = null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6101[9] + (arg0 != null ? field6101[7] : field6101[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "(II)[I"
   )
   private final int[] method3251(int arg0, int arg1) {
      try {
         ++field6090;
         if (arg0 < 0) {
            return null;
         } else if (~arg1 > -1) {
            return this.field6094;
         } else {
            return ~arg1 <= ~this.field6095.length ? this.field6087 : this.field6095[arg1];
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6101[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method3252(int arg0) {
      try {
         ++field6088;
         int[] var2 = this.field6095[0];
         if (arg0 == -3245) {
            int[] var3 = this.field6095[1];
            int[] var4 = this.field6095[this.field6095.length + -2];
            int[] var5 = this.field6095[this.field6095.length + -1];
            this.field6087 = new int[]{var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1]};
            this.field6094 = new int[]{-var3[0] - (-var2[0] - var2[0]), var2[1] - (var3[1] - var2[1])};
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6101[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method3253(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         if (arg0 >= 118) {
            if (this.field6095 == null) {
               this.field6095 = new int[][]{new int[2], {4096, 4096}};
            }

            ++field6093;
            if (~this.field6095.length > -3) {
               throw new RuntimeException(field6101[4]);
            } else {
               if (this.field6089 == 2) {
                  this.method3252(-3245);
               }

               class22.method299(4096);
               this.method3253(1);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6101[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6096;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            method3250(-89);
         }

         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, 13064, 0);
            int var6 = 0;
            if (var3 || var6 < class563.field8014) {
               do {
                  int var7 = var5[var6] >> 4;
                  if (var7 < 0) {
                     var7 = 0;
                  }

                  if (var7 > 256) {
                     var7 = 256;
                  }

                  var4[var6] = this.field6092[var7];
                  ++var6;
               } while(var6 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6101[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "()V"
   )
   public class416() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!ne",
      name = "e",
      descriptor = "(B)I"
   )
   public static final int method3254(byte arg0) {
      try {
         ++field6091;
         if ((double)class651.field9212 == 3.0D) {
            return 37;
         } else if ((double)class651.field9212 == 4.0D) {
            return 50;
         } else if (arg0 != 94) {
            return 91;
         } else if ((double)class651.field9212 == 6.0D) {
            return 75;
         } else {
            return (double)class651.field9212 == 8.0D ? 100 : 200;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6101[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3255(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3256(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
