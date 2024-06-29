import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class656 extends class120 {
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field9794;
   @OriginalMember(
      owner = "client!qaa",
      name = "x",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field9792;
   @OriginalMember(
      owner = "client!qaa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9811 = new String[]{method4838(method4837("R4[y\u0007\u000b")), method4838(method4837("R4[y\u0002\u000b")), method4838(method4837("R4[y\f\u000b")), method4838(method4837("X{\u0014y9")), method4838(method4837("M V;")), method4838(method4837("R4[yxJ;S#z\u000b")), method4838(method4837("R4[y\u0003\u000b")), method4838(method4837("R4[y\u0001\u000b")), method4838(method4837("R4[y\u0000\u000b")), method4838(method4837("R4[y\u0005\u000b")), method4838(method4837("R4[y\u0006\u000b"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field9809 = new int[2];
   @OriginalMember(
      owner = "client!qaa",
      name = "Q",
      descriptor = "J"
   )
   public static long field9800 = 0L;
   @OriginalMember(
      owner = "client!qaa",
      name = "D",
      descriptor = "D"
   )
   private double field9807;
   @OriginalMember(
      owner = "client!qaa",
      name = "L",
      descriptor = "I"
   )
   public static int field9791;
   @OriginalMember(
      owner = "client!qaa",
      name = "y",
      descriptor = "I"
   )
   public static int field9793;
   @OriginalMember(
      owner = "client!qaa",
      name = "P",
      descriptor = "I"
   )
   public static int field9795;
   @OriginalMember(
      owner = "client!qaa",
      name = "I",
      descriptor = "I"
   )
   public static int field9796;
   @OriginalMember(
      owner = "client!qaa",
      name = "A",
      descriptor = "I"
   )
   public static int field9798;
   @OriginalMember(
      owner = "client!qaa",
      name = "G",
      descriptor = "I"
   )
   public static int field9799;
   @OriginalMember(
      owner = "client!qaa",
      name = "E",
      descriptor = "I"
   )
   public static int field9801;
   @OriginalMember(
      owner = "client!qaa",
      name = "C",
      descriptor = "I"
   )
   private int field9802;
   @OriginalMember(
      owner = "client!qaa",
      name = "B",
      descriptor = "I"
   )
   public static int field9803;
   @OriginalMember(
      owner = "client!qaa",
      name = "J",
      descriptor = "I"
   )
   public static int field9805;
   @OriginalMember(
      owner = "client!qaa",
      name = "O",
      descriptor = "I"
   )
   public static int field9806;
   @OriginalMember(
      owner = "client!qaa",
      name = "F",
      descriptor = "Ljf;"
   )
   private class398 field9810;
   @OriginalMember(
      owner = "client!qaa",
      name = "w",
      descriptor = "Loc;"
   )
   private class781 field9808;
   @OriginalMember(
      owner = "client!qaa",
      name = "K",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field9804;
   @OriginalMember(
      owner = "client!qaa",
      name = "M",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field9797;

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V",
      line = 4
   )
   public final void method1113(OggPacket arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         label86: {
            ++field9796;
            if (super.field1699 < 3) {
               int var4 = this.field9794.headerIn(this.field9792, arg0);
               if (~var4 > -1) {
                  throw new IllegalStateException(String.valueOf(var4));
               }

               if (~super.field1699 != -3) {
                  break label86;
               }

               if (~this.field9794.channels < -3 || this.field9794.channels < 1) {
                  throw new RuntimeException(String.valueOf(this.field9794.channels));
               }

               this.field9804 = new DSPState(this.field9794);
               this.field9797 = new VorbisBlock(this.field9804);
               this.field9810 = new class398(this.field9794.rate, class752.field11155);
               this.field9808 = new class781(this.field9794.channels);
               if (!var3) {
                  break label86;
               }
            }

            if (this.field9797.synthesis(arg0) == 0) {
               this.field9804.blockIn(this.field9797);
            }

            float[][] var5 = this.field9804.pcmOut(this.field9794.channels);
            this.field9807 = this.field9804.granuleTime();
            if (this.field9807 == -1.0D) {
               this.field9807 = (double)((float)this.field9802 / (float)this.field9794.rate);
            }

            this.field9804.read(var5[0].length);
            this.field9802 += var5[0].length;
            class664 var6 = this.field9808.method5682(this.field9807, var5[0].length, false);
            class149.method1368(var6.field9942, var5, (byte)77);
            int var7 = 0;
            if (var3) {
               var6.field9942[var7] = this.field9810.method3209(true, var6.field9942[var7]);
               ++var7;
            }

            while(true) {
               while(~var7 > ~this.field9794.channels) {
                  var6.field9942[var7] = this.field9810.method3209(true, var6.field9942[var7]);
                  ++var7;
               }

               if (!var3) {
                  this.field9808.method5680(var6, false);
                  break;
               }

               ++var7;
            }
         }

         if (arg1 < 53) {
            this.method1113((OggPacket)null, -68);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9811[6] + (arg0 != null ? field9811[3] : field9811[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "c",
      descriptor = "(I)Loc;",
      line = 69
   )
   public final class781 method4831(int arg0) {
      try {
         ++field9801;
         if (arg0 > -30) {
            this.field9792 = null;
         }

         return this.field9808;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9811[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V",
      line = 82
   )
   public class656(OggStreamState arg0) {
      super(arg0);

      try {
         this.field9794 = new VorbisInfo();
         this.field9792 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9811[5] + (arg0 != null ? field9811[3] : field9811[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IB)Z",
      line = 92
   )
   public static final boolean method4832(int arg0, byte arg1) {
      try {
         ++field9799;
         if (~arg0 != -61 && ~arg0 != -46 && ~arg0 != -48 && arg0 != 17 && ~arg0 != -10 && arg0 != 1008) {
            if (arg1 <= 120) {
               field9800 = -128L;
            }

            return ~arg0 == -49;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9811[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(I)V",
      line = 118
   )
   public final void method1109(int arg0) {
      try {
         if (this.field9797 != null) {
            this.field9797.method2673();
         }

         ++field9795;
         if (this.field9804 != null) {
            this.field9804.method2673();
         }

         if (arg0 <= 83) {
            this.field9794 = null;
         }

         this.field9792.method2673();
         this.field9794.method2673();
         if (this.field9808 != null) {
            this.field9808.method5678(-82);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Lru;IIIB)V",
      line = 141
   )
   public static final void method4833(class333 param0, int param1, int param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Z)V",
      line = 185
   )
   public static void method4834(boolean arg0) {
      try {
         field9809 = null;
         if (!arg0) {
            method4834(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9811[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "c",
      descriptor = "(B)D",
      line = 195
   )
   public final double method4835(byte arg0) {
      try {
         ++field9798;
         if (arg0 != -50) {
            this.field9810 = null;
         }

         double var2 = this.field9807;
         if (this.field9808 != null) {
            var2 = this.field9808.method5677(arg0 + -67);
            if (var2 < 0.0D) {
               var2 = this.field9807;
            }
         }

         return (double)(-(256.0F / (float)class752.field11155)) + var2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9811[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(B)I",
      line = 219
   )
   public final int method4836(byte arg0) {
      try {
         ++field9791;
         if (arg0 < 22) {
            return 43;
         } else {
            return this.field9808 == null ? 0 : this.field9808.method5683(-117);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9811[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4837(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4838(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
