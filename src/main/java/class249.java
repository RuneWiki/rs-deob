import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class249 extends class29 {
   @OriginalMember(
      owner = "client!lf",
      name = "w",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field3125;
   @OriginalMember(
      owner = "client!lf",
      name = "B",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field3126;
   @OriginalMember(
      owner = "client!lf",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3134 = new String[]{method1878(method1877("e\u001d\u0003\u0001m")), method1878(method1877("rU\u0003m8")), method1878(method1877("pFAC")), method1878(method1877("rU\u0003j8")), method1878(method1877("rU\u0003h8")), method1878(method1877("rU\u0003l8")), method1878(method1877("rU\u0003\u0013ypZY\u00118")), method1878(method1877("rU\u0003i8")), method1878(method1877("rU\u0003n8")), method1878(method1877("rU\u0003f8")), method1878(method1877("rU\u0003g8"))};
   @OriginalMember(
      owner = "client!lf",
      name = "A",
      descriptor = "I"
   )
   public static int field3122 = -1;
   @OriginalMember(
      owner = "client!lf",
      name = "u",
      descriptor = "D"
   )
   private double field3117;
   @OriginalMember(
      owner = "client!lf",
      name = "q",
      descriptor = "I"
   )
   public static int field3119;
   @OriginalMember(
      owner = "client!lf",
      name = "r",
      descriptor = "I"
   )
   public static int field3120;
   @OriginalMember(
      owner = "client!lf",
      name = "t",
      descriptor = "I"
   )
   public static int field3121;
   @OriginalMember(
      owner = "client!lf",
      name = "C",
      descriptor = "I"
   )
   public static int field3123;
   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "I"
   )
   public static int field3124;
   @OriginalMember(
      owner = "client!lf",
      name = "x",
      descriptor = "I"
   )
   public static int field3127;
   @OriginalMember(
      owner = "client!lf",
      name = "D",
      descriptor = "I"
   )
   private int field3130;
   @OriginalMember(
      owner = "client!lf",
      name = "F",
      descriptor = "I"
   )
   public static int field3132;
   @OriginalMember(
      owner = "client!lf",
      name = "E",
      descriptor = "I"
   )
   public static int field3133;
   @OriginalMember(
      owner = "client!lf",
      name = "s",
      descriptor = "Ldu;"
   )
   private class377 field3128;
   @OriginalMember(
      owner = "client!lf",
      name = "p",
      descriptor = "Llha;"
   )
   private class656 field3118;
   @OriginalMember(
      owner = "client!lf",
      name = "y",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field3131;
   @OriginalMember(
      owner = "client!lf",
      name = "v",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field3129;

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method242(int arg0, OggPacket arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 != 16) {
            this.method1873(-40);
         }

         ++field3120;
         if (super.field355 < 3) {
            int var4 = this.field3125.headerIn(this.field3126, arg1);
            if (var4 < 0) {
               throw new IllegalStateException(String.valueOf(var4));
            }

            if (super.field355 == 2) {
               if (~this.field3125.channels >= -3 && this.field3125.channels >= 1) {
                  this.field3131 = new DSPState(this.field3125);
                  this.field3129 = new VorbisBlock(this.field3131);
                  this.field3128 = new class377(this.field3125.rate, class556.field7644);
                  this.field3118 = new class656(this.field3125.channels);
                  return;
               }

               throw new RuntimeException(String.valueOf(this.field3125.channels));
            }
         } else {
            if (this.field3129.synthesis(arg1) == 0) {
               this.field3131.blockIn(this.field3129);
            }

            float[][] var5 = this.field3131.pcmOut(this.field3125.channels);
            this.field3117 = this.field3131.granuleTime();
            if (this.field3117 == -1.0D) {
               this.field3117 = (double)((float)this.field3130 / (float)this.field3125.rate);
            }

            this.field3131.read(var5[0].length);
            this.field3130 += var5[0].length;
            class470 var6 = this.field3118.method4745(42, this.field3117, var5[0].length);
            class621.method4516(var5, var6.field6514, arg0 + 30910);
            int var7 = 0;
            if (var3) {
               var6.field6514[var7] = this.field3128.method2907(-120, var6.field6514[var7]);
               ++var7;
            }

            while(true) {
               while(~this.field3125.channels < ~var7) {
                  var6.field6514[var7] = this.field3128.method2907(-120, var6.field6514[var7]);
                  ++var7;
               }

               if (!var3) {
                  this.field3118.method4746(var6, (byte)73);
                  break;
               }

               ++var7;
            }
         }

      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3134[3] + arg0 + ',' + (arg1 != null ? field3134[0] : field3134[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(CLjava/lang/String;Z)[Ljava/lang/String;"
   )
   public static final String[] method1870(char arg0, String arg1, boolean arg2) {
      boolean var3 = client.field4273;

      try {
         ++field3133;
         int var4 = class671.method4920((byte)1, arg1, arg0);
         String[] var5 = new String[var4 + 1];
         int var6 = 0;
         if (arg2) {
            return null;
         } else {
            int var7 = 0;
            int var8 = 0;
            int var9;
            if (var3) {
               var9 = var7;
               if (var3) {
                  var9 = var7 + 1;
               }
            } else {
               if (~var8 <= ~var4) {
                  var5[var4] = arg1.substring(var7);
                  return var5;
               }

               var9 = var7;
               if (var3) {
                  var9 = var7 + 1;
               }
            }

            while(true) {
               while(~arg1.charAt(var9) != ~arg0) {
                  ++var9;
               }

               var5[var6++] = arg1.substring(var7, var9);
               var7 = var9 + 1;
               ++var8;
               if (~var8 <= ~var4) {
                  var5[var4] = arg1.substring(var7);
                  return var5;
               }

               var9 = var7;
               if (var3) {
                  var9 = var7 + 1;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field3134[1] + arg0 + ',' + (arg1 != null ? field3134[0] : field3134[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method238(byte arg0) {
      try {
         if (this.field3129 != null) {
            this.field3129.method5384();
         }

         ++field3127;
         if (arg0 != 112) {
            this.field3125 = null;
         }

         if (this.field3131 != null) {
            this.field3131.method5384();
         }

         this.field3126.method5384();
         this.field3125.method5384();
         if (this.field3118 != null) {
            this.field3118.method4736((byte)40);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3134[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1871(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      if (var3 != null) {
         class726.method5282(var3.field2824);
         class726.method5282(var3.field2822);
         if (var3.field2824 != null) {
            var3.field2824 = null;
         }

         if (var3.field2822 != null) {
            var3.field2822 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IZ[BI)[B"
   )
   public static final byte[] method1872(int arg0, boolean arg1, byte[] arg2, int arg3) {
      try {
         if (arg1) {
            return null;
         } else {
            ++field3124;
            byte[] var4 = new byte[arg3];
            class714.method5200(arg2, arg0, var4, 0, arg3);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3134[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3134[0] : field3134[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class249(OggStreamState arg0) {
      super(arg0);

      try {
         this.field3125 = new VorbisInfo();
         this.field3126 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3134[6] + (arg0 != null ? field3134[0] : field3134[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "(I)D"
   )
   public final double method1873(int arg0) {
      try {
         ++field3121;
         double var2 = this.field3117;
         if (arg0 != 0) {
            this.method242(-115, (OggPacket)null);
         }

         if (this.field3118 != null) {
            var2 = this.field3118.method4737(0);
            if (var2 < 0.0D) {
               var2 = this.field3117;
            }
         }

         return (double)(-(256.0F / (float)class556.field7644)) + var2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3134[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1874(byte arg0) {
      try {
         ++field3123;
         int var2 = -41 / ((arg0 - -41) / 60);
         return this.field3118 == null ? 0 : this.field3118.method4744((byte)-70);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3134[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "e",
      descriptor = "(I)I"
   )
   public static final int method1875(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field3132;
         class65 var2 = class338.field4832;
         boolean var3 = false;
         if (~class674.field9907.field8451.method2770((byte)-125) != -1) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class459.method3377(0, (class74)null, var4, -71, 0, (class160)null);
            var3 = true;
         }

         long var5 = class792.method5708(-25005);
         int var7 = 0;
         if (var1) {
            var2.method520(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            ++var7;
         }

         while(true) {
            while(var7 < 10000) {
               var2.method520(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
               ++var7;
            }

            int var8 = (int)(-var5 + class792.method5708(-25005));
            var2.method510(3966, 0, 0, -16777216, 100, 100);
            if (!var1) {
               if (arg0 >= -6) {
                  method1875(-15);
               }

               if (var3) {
                  var2.method559(-10565);
               }

               return var8;
            }

            ++var7;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field3134[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(I)Llha;"
   )
   public final class656 method1876(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field3119;
            return this.field3118;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3134[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1877(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1878(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
