import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class688 extends class153 {
   @OriginalMember(
      owner = "client!bca",
      name = "s",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field10117;
   @OriginalMember(
      owner = "client!bca",
      name = "O",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field10122;
   @OriginalMember(
      owner = "client!bca",
      name = "K",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field10115;
   @OriginalMember(
      owner = "client!bca",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10128 = new String[]{method5017(method5016("\\f\u007fb\u001b\u0016")), method5017(method5016("\\f\u007fb\u0010\u0016")), method5017(method5016("\\f\u007fb\u0012\u0016")), method5017(method5016("\\f\u007fb\u0015\u0016")), method5017(method5016("Ppr ")), method5017(method5016("E+0b.")), method5017(method5016("\\f\u007fb\u0011\u0016")), method5017(method5016("\\f\u007fb\u0016\u0016")), method5017(method5016("\\f\u007fb\u001e\u0016")), method5017(method5016("\\f\u007fb\u001d\u0016")), method5017(method5016("\\f\u007fboWkw8m\u0016")), method5017(method5016("\\f\u007fb\u001a\u0016")), method5017(method5016("\\f\u007fb\u0017\u0016")), method5017(method5016("\\f\u007fb\u0014\u0016"))};
   @OriginalMember(
      owner = "client!bca",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10100 = new String[]{method5017(method5016("tdp")), method5017(method5016("x`|")), method5017(method5016("sdl")), method5017(method5016("\u007ful")), method5017(method5016("sdg")), method5017(method5016("tpp")), method5017(method5016("tpr")), method5017(method5016("\u007fpy")), method5017(method5016("m`n")), method5017(method5016("qfj")), method5017(method5016("pjh")), method5017(method5016("z`}"))};
   @OriginalMember(
      owner = "client!bca",
      name = "u",
      descriptor = "I"
   )
   public static int field10112 = 0;
   @OriginalMember(
      owner = "client!bca",
      name = "A",
      descriptor = "D"
   )
   private double field10118;
   @OriginalMember(
      owner = "client!bca",
      name = "G",
      descriptor = "I"
   )
   public static int field10102;
   @OriginalMember(
      owner = "client!bca",
      name = "S",
      descriptor = "I"
   )
   public static int field10104;
   @OriginalMember(
      owner = "client!bca",
      name = "N",
      descriptor = "I"
   )
   public static int field10109;
   @OriginalMember(
      owner = "client!bca",
      name = "R",
      descriptor = "I"
   )
   public static int field10110;
   @OriginalMember(
      owner = "client!bca",
      name = "I",
      descriptor = "I"
   )
   public static int field10113;
   @OriginalMember(
      owner = "client!bca",
      name = "x",
      descriptor = "I"
   )
   public static int field10114;
   @OriginalMember(
      owner = "client!bca",
      name = "J",
      descriptor = "I"
   )
   private int field10120;
   @OriginalMember(
      owner = "client!bca",
      name = "L",
      descriptor = "I"
   )
   private int field10121;
   @OriginalMember(
      owner = "client!bca",
      name = "P",
      descriptor = "I"
   )
   public static int field10123;
   @OriginalMember(
      owner = "client!bca",
      name = "B",
      descriptor = "I"
   )
   public static int field10124;
   @OriginalMember(
      owner = "client!bca",
      name = "C",
      descriptor = "I"
   )
   public static int field10125;
   @OriginalMember(
      owner = "client!bca",
      name = "H",
      descriptor = "I"
   )
   public static int field10127;
   @OriginalMember(
      owner = "client!bca",
      name = "D",
      descriptor = "J"
   )
   private long field10119;
   @OriginalMember(
      owner = "client!bca",
      name = "t",
      descriptor = "Lhw;"
   )
   public static class141 field10106;
   @OriginalMember(
      owner = "client!bca",
      name = "T",
      descriptor = "Ltd;"
   )
   private class476 field10107;
   @OriginalMember(
      owner = "client!bca",
      name = "w",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field10108;
   @OriginalMember(
      owner = "client!bca",
      name = "F",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field10111;
   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field10105;
   @OriginalMember(
      owner = "client!bca",
      name = "M",
      descriptor = "Z"
   )
   private boolean field10101;
   @OriginalMember(
      owner = "client!bca",
      name = "y",
      descriptor = "Z"
   )
   private boolean field10103;
   @OriginalMember(
      owner = "client!bca",
      name = "E",
      descriptor = "Z"
   )
   private boolean field10116;
   @OriginalMember(
      owner = "client!bca",
      name = "v",
      descriptor = "Z"
   )
   private boolean field10126;

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "(BI)I",
      line = 4
   )
   public static final int method5007(byte arg0, int arg1) {
      try {
         if (arg0 <= 85) {
            method5011((byte)29, -60);
         }

         ++field10102;
         return arg1 & 127;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Lha;B)Ltd;",
      line = 15
   )
   public final class476 method5008(class65 arg0, byte arg1) {
      try {
         ++field10110;
         if (this.field10111 == null) {
            return null;
         } else if (!this.field10116 && this.field10107 != null) {
            return this.field10107;
         } else if (arg1 >= -9) {
            return null;
         } else {
            this.field10107 = arg0.method357(this.field10111.pixels, 0, this.field10111.field10666, this.field10111.field10666, this.field10111.field10665, false);
            this.field10116 = false;
            return this.field10107;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10128[7] + (arg0 != null ? field10128[5] : field10128[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "f",
      descriptor = "(I)J",
      line = 37
   )
   public final long method5009(int arg0) {
      try {
         if (arg0 < 125) {
            return 113L;
         } else {
            ++field10125;
            return this.field10119;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(B)F",
      line = 53
   )
   public final float method5010(byte arg0) {
      try {
         ++field10123;
         if (this.field10103 && !this.field10122.method5340()) {
            return arg0 < 26 ? 1.1154864F : (float)this.field10122.fpsNumerator / (float)this.field10122.fpsDenominator;
         } else {
            return 0.0F;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(BI)Z",
      line = 70
   )
   public static final boolean method5011(byte arg0, int arg1) {
      try {
         if (arg0 > -111) {
            field10112 = -50;
         }

         ++field10114;
         return ~arg1 == -54 || ~arg1 == -46 || ~arg1 == -9 || arg1 == 57 || arg1 == 4 || arg1 == 19 || arg1 == 44;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(I)V",
      line = 83
   )
   public static void method5012(int arg0) {
      try {
         field10100 = null;
         field10106 = null;
         if (arg0 != 0) {
            method5007((byte)102, 64);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10128[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IB)V",
      line = 94
   )
   private final void method5013(int arg0, byte arg1) {
      try {
         ++field10104;
         this.field10120 = arg0;
         if (arg1 != 102) {
            this.method5008((class65)null, (byte)78);
         }

         if (this.field10103) {
            if (~this.field10121 > ~this.field10120) {
               this.field10120 = this.field10121;
            }

            if (~this.field10120 > -1) {
               this.field10120 = 0;
            }

            this.field10108.setPostProcessingLevel(this.field10120);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10128[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V",
      line = 121
   )
   public final void method1418(OggPacket arg0, int arg1) {
      try {
         label76: {
            ++field10113;
            if (this.field10103) {
               this.field10119 = class57.method650(92);
               int var3 = this.field10108.decodePacketIn(arg0, this.field10105);
               if (~var3 > -1) {
                  throw new IllegalStateException(String.valueOf(var3));
               }

               this.field10108.granuleFrame(this.field10105);
               this.field10118 = this.field10108.granuleTime(this.field10105);
               if (this.field10101) {
                  boolean var4 = ~arg0.isKeyFrame() == -2;
                  if (!var4) {
                     return;
                  }

                  this.field10101 = false;
               }

               if (this.field10126 && arg0.isKeyFrame() != 1) {
                  break label76;
               }

               if (~this.field10108.decodeFrame(this.field10111) != -1) {
                  throw new IllegalStateException(String.valueOf(var3));
               }

               this.field10116 = true;
               if (!client.field4564) {
                  break label76;
               }
            }

            int var5 = this.field10117.decodeHeader(this.field10122, this.field10115, arg0);
            if (var5 != 0) {
               if (var5 < 0) {
                  throw new IllegalStateException(String.valueOf(var5));
               }
            } else {
               this.field10103 = true;
               if (~this.field10122.frameWidth < -2049 || ~this.field10122.frameHeight < -1025) {
                  throw new IllegalStateException();
               }

               this.field10108 = new DecoderContext(this.field10122, this.field10117);
               this.field10105 = new GranulePos();
               this.field10111 = new Frame(this.field10122.frameWidth, this.field10122.frameHeight);
               this.field10121 = this.field10108.getMaxPostProcessingLevel();
               this.method5013(this.field10120, (byte)102);
            }
         }

         if (arg1 < 92) {
            this.field10105 = null;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10128[6] + (arg0 != null ? field10128[5] : field10128[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "(B)Z",
      line = 197
   )
   public final boolean method5014(byte arg0) {
      try {
         if (arg0 != -13) {
            method5011((byte)103, -77);
         }

         ++field10124;
         return this.field10103;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(B)V",
      line = 210
   )
   public final void method1419(byte arg0) {
      try {
         if (this.field10111 != null) {
            this.field10111.method5341();
         }

         if (arg0 > 65) {
            ++field10127;
            if (this.field10108 != null) {
               this.field10108.method5341();
               this.field10108 = null;
            }

            if (this.field10105 != null) {
               this.field10105.method5341();
               this.field10105 = null;
            }

            this.field10122.method5341();
            this.field10115.method5341();
            this.field10117.method5341();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V",
      line = 242
   )
   public class688(OggStreamState arg0) {
      super(arg0);

      try {
         this.field10117 = new SetupInfo();
         this.field10122 = new TheoraInfo();
         this.field10115 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[10] + (arg0 != null ? field10128[5] : field10128[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "e",
      descriptor = "(I)D",
      line = 252
   )
   public final double method5015(int arg0) {
      try {
         ++field10109;
         if (arg0 <= 24) {
            this.field10119 = -92L;
         }

         return this.field10118;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10128[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5016(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5017(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
