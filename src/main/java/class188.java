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

@OriginalClass("client!gg")
public class class188 extends class508 {
   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field2669;
   @OriginalMember(
      owner = "client!gg",
      name = "w",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field2682;
   @OriginalMember(
      owner = "client!gg",
      name = "P",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field2663;
   @OriginalMember(
      owner = "client!gg",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2690 = new String[]{method1494(method1493("h\u000f_cK")), method1494(method1493("a\u001d\u001dE")), method1494(method1493("h\u000f_\u0015\na\u0001\u0005\u0017K")), method1494(method1493("tF_\u0007\u001e")), method1494(method1493("h\u000f_hK")), method1494(method1493("h\u000f_kK")), method1494(method1493("h\u000f_oK")), method1494(method1493("h\u000f_jK")), method1494(method1493("h\u000f_lK")), method1494(method1493("h\u000f_nK")), method1494(method1493("h\u000f_`K")), method1494(method1493("h\u000f_mK")), method1494(method1493("h\u000f_aK"))};
   @OriginalMember(
      owner = "client!gg",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field2667 = new int[1000];
   @OriginalMember(
      owner = "client!gg",
      name = "A",
      descriptor = "[Z"
   )
   public static boolean[] field2673 = new boolean[100];
   @OriginalMember(
      owner = "client!gg",
      name = "s",
      descriptor = "I"
   )
   public static int field2684 = 1;
   @OriginalMember(
      owner = "client!gg",
      name = "x",
      descriptor = "D"
   )
   private double field2671;
   @OriginalMember(
      owner = "client!gg",
      name = "F",
      descriptor = "I"
   )
   public static int field2662;
   @OriginalMember(
      owner = "client!gg",
      name = "H",
      descriptor = "I"
   )
   public static int field2664;
   @OriginalMember(
      owner = "client!gg",
      name = "v",
      descriptor = "I"
   )
   public static int field2674;
   @OriginalMember(
      owner = "client!gg",
      name = "T",
      descriptor = "I"
   )
   public static int field2675;
   @OriginalMember(
      owner = "client!gg",
      name = "y",
      descriptor = "I"
   )
   public static int field2677;
   @OriginalMember(
      owner = "client!gg",
      name = "M",
      descriptor = "I"
   )
   public static int field2678;
   @OriginalMember(
      owner = "client!gg",
      name = "G",
      descriptor = "I"
   )
   public static int field2679;
   @OriginalMember(
      owner = "client!gg",
      name = "S",
      descriptor = "I"
   )
   private int field2683;
   @OriginalMember(
      owner = "client!gg",
      name = "J",
      descriptor = "I"
   )
   public static int field2686;
   @OriginalMember(
      owner = "client!gg",
      name = "Q",
      descriptor = "I"
   )
   public static int field2687;
   @OriginalMember(
      owner = "client!gg",
      name = "r",
      descriptor = "I"
   )
   public static int field2688;
   @OriginalMember(
      owner = "client!gg",
      name = "N",
      descriptor = "I"
   )
   private int field2689;
   @OriginalMember(
      owner = "client!gg",
      name = "D",
      descriptor = "J"
   )
   private long field2685;
   @OriginalMember(
      owner = "client!gg",
      name = "L",
      descriptor = "Lbg;"
   )
   private class492 field2676;
   @OriginalMember(
      owner = "client!gg",
      name = "C",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field2670;
   @OriginalMember(
      owner = "client!gg",
      name = "u",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field2665;
   @OriginalMember(
      owner = "client!gg",
      name = "t",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field2681;
   @OriginalMember(
      owner = "client!gg",
      name = "O",
      descriptor = "Z"
   )
   private boolean field2666;
   @OriginalMember(
      owner = "client!gg",
      name = "B",
      descriptor = "Z"
   )
   private boolean field2668;
   @OriginalMember(
      owner = "client!gg",
      name = "R",
      descriptor = "Z"
   )
   private boolean field2672;
   @OriginalMember(
      owner = "client!gg",
      name = "I",
      descriptor = "Z"
   )
   private boolean field2680;

   @OriginalMember(
      owner = "client!gg",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1483(int arg0) {
      try {
         field2673 = null;
         field2667 = null;
         if (arg0 > -59) {
            field2679 = -69;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2690[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(B)F"
   )
   public final float method1484(byte arg0) {
      try {
         ++field2678;
         if (arg0 != -114) {
            field2679 = -16;
         }

         return this.field2680 && !this.field2682.method5389() ? (float)this.field2682.fpsNumerator / (float)this.field2682.fpsDenominator : 0.0F;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2690[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(ZLjagtheora/ogg/OggPacket;)V"
   )
   public final void method1485(boolean arg0, OggPacket arg1) {
      boolean var3 = client.field4360;

      try {
         ++field2687;
         if (!this.field2680) {
            label76: {
               int var4 = this.field2669.decodeHeader(this.field2682, this.field2663, arg1);
               if (var4 == 0) {
                  this.field2680 = true;
                  if (~this.field2682.frameWidth < -2049 || this.field2682.frameHeight > 1024) {
                     throw new IllegalStateException();
                  }

                  this.field2670 = new DecoderContext(this.field2682, this.field2669);
                  this.field2681 = new GranulePos();
                  this.field2665 = new Frame(this.field2682.frameWidth, this.field2682.frameHeight);
                  this.field2683 = this.field2670.getMaxPostProcessingLevel();
                  this.method1487(this.field2689, 63);
                  if (!var3) {
                     break label76;
                  }
               }

               if (~var4 > -1) {
                  throw new IllegalStateException(String.valueOf(var4));
               }
            }
         } else {
            this.field2685 = class133.method1054(-29025);
            int var5 = this.field2670.decodePacketIn(arg1, this.field2681);
            if (~var5 > -1) {
               throw new IllegalStateException(String.valueOf(var5));
            }

            this.field2670.granuleFrame(this.field2681);
            this.field2671 = this.field2670.granuleTime(this.field2681);
            if (this.field2668) {
               boolean var6 = ~arg1.isKeyFrame() == -2;
               if (!var6) {
                  return;
               }

               this.field2668 = false;
               if (var3) {
                  return;
               }
            }

            if (!this.field2666 || ~arg1.isKeyFrame() == -2) {
               if (~this.field2670.decodeFrame(this.field2665) != -1) {
                  throw new IllegalStateException(String.valueOf(var5));
               }

               this.field2672 = true;
            }
         }

         if (arg0) {
            method1483(113);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2690[6] + arg0 + ',' + (arg1 != null ? field2690[3] : field2690[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1486(int arg0) {
      try {
         ++field2677;
         if (arg0 != -5238) {
            this.method1487(49, -84);
         }

         if (this.field2665 != null) {
            this.field2665.method5388();
         }

         if (this.field2670 != null) {
            this.field2670.method5388();
            this.field2670 = null;
         }

         if (this.field2681 != null) {
            this.field2681.method5388();
            this.field2681 = null;
         }

         this.field2682.method5388();
         this.field2663.method5388();
         this.field2669.method5388();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2690[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method1487(int arg0, int arg1) {
      try {
         ++field2675;
         this.field2689 = arg0;
         if (this.field2680) {
            if (~this.field2689 < ~this.field2683) {
               this.field2689 = this.field2683;
            }

            if (this.field2689 < 0) {
               this.field2689 = 0;
            }

            this.field2670.setPostProcessingLevel(this.field2689);
         }

         if (arg1 <= 47) {
            this.method1486(108);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2690[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1488(int arg0) {
      try {
         if (arg0 > -121) {
            this.method1487(-49, -44);
         }

         ++field2686;
         return this.field2680;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2690[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(ILha;)Lbg;"
   )
   public final class492 method1489(int arg0, class66 arg1) {
      try {
         ++field2688;
         if (this.field2665 == null) {
            return null;
         } else if (!this.field2672 && this.field2676 != null) {
            return this.field2676;
         } else if (arg0 != 26479) {
            return null;
         } else {
            this.field2676 = arg1.method515(this.field2665.pixels, 0, this.field2665.field10834, this.field2665.field10834, this.field2665.field10835, false);
            this.field2672 = false;
            return this.field2676;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2690[4] + arg0 + ',' + (arg1 != null ? field2690[3] : field2690[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method1490(int arg0) {
      try {
         ++field2664;
         if (arg0 > -74) {
            this.method1489(-1, (class66)null);
         }

         return this.field2685;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2690[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "c",
      descriptor = "(Z)D"
   )
   public final double method1491(boolean arg0) {
      try {
         ++field2674;
         if (arg0) {
            this.method1491(false);
         }

         return this.field2671;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2690[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1492(int arg0) {
      try {
         class227.field3215 = null;
         class715.field10406 = arg0;
         ++field2662;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2690[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class188(OggStreamState arg0) {
      super(arg0);

      try {
         this.field2669 = new SetupInfo();
         this.field2682 = new TheoraInfo();
         this.field2663 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2690[2] + (arg0 != null ? field2690[3] : field2690[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1493(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1494(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
