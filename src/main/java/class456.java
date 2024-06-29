import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class456 extends class508 {
   @OriginalMember(
      owner = "client!mea",
      name = "H",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field6488;
   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field6493;
   @OriginalMember(
      owner = "client!mea",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6501 = new String[]{method3331(method3330(":;cU~\u007f")), method3331(method3330(":;cUz\u007f")), method3331(method3330(":;cUy\u007f")), method3331(method3330(":;cUr\u007f")), method3331(method3330(":;cU}\u007f")), method3331(method3330("9+n\u0017")), method3331(method3330(",p,UF")), method3331(method3330(":;cU\u0007>0k\u000f\u0005\u007f")), method3331(method3330(":;cUx\u007f")), method3331(method3330(":;cU\u007f\u007f"))};
   @OriginalMember(
      owner = "client!mea",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field6483 = new int[1000];
   @OriginalMember(
      owner = "client!mea",
      name = "w",
      descriptor = "Ljk;"
   )
   public static class662 field6494 = new class662();
   @OriginalMember(
      owner = "client!mea",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field6500 = new int[64];
   @OriginalMember(
      owner = "client!mea",
      name = "C",
      descriptor = "D"
   )
   private double field6491;
   @OriginalMember(
      owner = "client!mea",
      name = "D",
      descriptor = "I"
   )
   private int field6484;
   @OriginalMember(
      owner = "client!mea",
      name = "G",
      descriptor = "I"
   )
   public static int field6486;
   @OriginalMember(
      owner = "client!mea",
      name = "s",
      descriptor = "I"
   )
   public static int field6487;
   @OriginalMember(
      owner = "client!mea",
      name = "x",
      descriptor = "I"
   )
   public static int field6490;
   @OriginalMember(
      owner = "client!mea",
      name = "F",
      descriptor = "I"
   )
   public static int field6495;
   @OriginalMember(
      owner = "client!mea",
      name = "u",
      descriptor = "I"
   )
   public static int field6497;
   @OriginalMember(
      owner = "client!mea",
      name = "I",
      descriptor = "I"
   )
   public static int field6498;
   @OriginalMember(
      owner = "client!mea",
      name = "B",
      descriptor = "Lvja;"
   )
   public static class290 field6489;
   @OriginalMember(
      owner = "client!mea",
      name = "A",
      descriptor = "Lhe;"
   )
   private class393 field6496;
   @OriginalMember(
      owner = "client!mea",
      name = "r",
      descriptor = "Lfj;"
   )
   private class685 field6499;
   @OriginalMember(
      owner = "client!mea",
      name = "t",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field6485;
   @OriginalMember(
      owner = "client!mea",
      name = "v",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field6492;

   @OriginalMember(
      owner = "client!mea",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class456(OggStreamState arg0) {
      super(arg0);

      try {
         this.field6488 = new VorbisInfo();
         this.field6493 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6501[7] + (arg0 != null ? field6501[6] : field6501[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1486(int arg0) {
      try {
         if (arg0 != -5238) {
            this.method3325(-19);
         }

         if (this.field6492 != null) {
            this.field6492.method5388();
         }

         ++field6490;
         if (this.field6485 != null) {
            this.field6485.method5388();
         }

         this.field6493.method5388();
         this.field6488.method5388();
         if (this.field6499 != null) {
            this.field6499.method4995(14250);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6501[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(ZLjagtheora/ogg/OggPacket;)V"
   )
   public final void method1485(boolean arg0, OggPacket arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0) {
            field6494 = null;
         }

         ++field6487;
         if (super.field7407 < 3) {
            int var4 = this.field6488.headerIn(this.field6493, arg1);
            if (var4 < 0) {
               throw new IllegalStateException(String.valueOf(var4));
            }

            if (super.field7407 == 2) {
               if (~this.field6488.channels >= -3 && ~this.field6488.channels <= -2) {
                  this.field6485 = new DSPState(this.field6488);
                  this.field6492 = new VorbisBlock(this.field6485);
                  this.field6496 = new class393(this.field6488.rate, class83.field1082);
                  this.field6499 = new class685(this.field6488.channels);
                  return;
               }

               throw new RuntimeException(String.valueOf(this.field6488.channels));
            }
         } else {
            if (~this.field6492.synthesis(arg1) == -1) {
               this.field6485.blockIn(this.field6492);
            }

            float[][] var5 = this.field6485.pcmOut(this.field6488.channels);
            this.field6491 = this.field6485.granuleTime();
            if (this.field6491 == -1.0D) {
               this.field6491 = (double)((float)this.field6484 / (float)this.field6488.rate);
            }

            this.field6485.read(var5[0].length);
            this.field6484 += var5[0].length;
            class68 var6 = this.field6499.method4998(this.field6491, var5[0].length, (byte)-72);
            class207.method1642(var5, var6.field840, 0);
            int var7 = 0;
            if (var3) {
               var6.field840[var7] = this.field6496.method2981(var6.field840[var7], -128);
               ++var7;
            }

            while(true) {
               while(~var7 > ~this.field6488.channels) {
                  var6.field840[var7] = this.field6496.method2981(var6.field840[var7], -128);
                  ++var7;
               }

               if (!var3) {
                  this.field6499.method4999(var6, 18790);
                  break;
               }

               ++var7;
            }
         }

      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field6501[4] + arg0 + ',' + (arg1 != null ? field6501[6] : field6501[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "d",
      descriptor = "(I)Lfj;"
   )
   public final class685 method3325(int arg0) {
      try {
         if (arg0 != 30361) {
            this.method1485(false, (OggPacket)null);
         }

         ++field6497;
         return this.field6499;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6501[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method3326(int arg0, byte arg1) {
      try {
         if (arg1 <= 97) {
            method3326(-16, (byte)14);
         }

         ++field6495;
         int var2 = 0;
         if (~arg0 > -1 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 16;
         }

         if (arg0 >= 256) {
            arg0 >>>= 8;
            var2 += 8;
         }

         if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
         }

         if (~arg0 <= -5) {
            var2 += 2;
            arg0 >>>= 2;
         }

         if (~arg0 <= -2) {
            arg0 >>>= 1;
            ++var2;
         }

         return var2 - -arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6501[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3327(int arg0) {
      try {
         if (arg0 != 64) {
            field6494 = null;
         }

         field6489 = null;
         field6500 = null;
         field6483 = null;
         field6494 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6501[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3328(byte arg0) {
      try {
         ++field6498;
         int var2 = 108 / ((arg0 - 7) / 37);
         return this.field6499 != null ? this.field6499.method4997(true) : 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6501[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "c",
      descriptor = "(I)D"
   )
   public final double method3329(int arg0) {
      try {
         ++field6486;
         if (arg0 != 0) {
            method3326(55, (byte)-39);
         }

         double var2 = this.field6491;
         if (this.field6499 != null) {
            var2 = this.field6499.method5003((byte)-120);
            if (var2 < 0.0D) {
               var2 = this.field6491;
            }
         }

         return (double)(-(256.0F / (float)class83.field1082)) + var2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6501[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3330(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3331(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
