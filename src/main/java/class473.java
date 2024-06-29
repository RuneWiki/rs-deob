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

@OriginalClass("client!lh")
public class class473 extends class120 {
   @OriginalMember(
      owner = "client!lh",
      name = "M",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field7195;
   @OriginalMember(
      owner = "client!lh",
      name = "G",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field7196;
   @OriginalMember(
      owner = "client!lh",
      name = "A",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field7200;
   @OriginalMember(
      owner = "client!lh",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7211 = new String[]{method3683(method3682("\nZQ;")), method3683(method3682("\bG\u0013\u001d\r")), method3683(method3682("\u001f\u0001\u0013yX")), method3683(method3682("\bG\u0013\u0015\r")), method3683(method3682("\bG\u0013kL\nFIi\r")), method3683(method3682("\bG\u0013\u0014\r")), method3683(method3682("\bG\u0013\u001e\r")), method3683(method3682("\bG\u0013\u0012\r")), method3683(method3682("\bG\u0013\u0011\r")), method3683(method3682("\bG\u0013\u0010\r")), method3683(method3682("\bG\u0013\u0016\r")), method3683(method3682("\bG\u0013\u001f\r")), method3683(method3682("\bG\u0013\u0013\r")), method3683(method3682("\bG\u0013\u0018\r"))};
   @OriginalMember(
      owner = "client!lh",
      name = "U",
      descriptor = "D"
   )
   private double field7187;
   @OriginalMember(
      owner = "client!lh",
      name = "E",
      descriptor = "I"
   )
   public static int field7185;
   @OriginalMember(
      owner = "client!lh",
      name = "K",
      descriptor = "I"
   )
   public static int field7188;
   @OriginalMember(
      owner = "client!lh",
      name = "Q",
      descriptor = "I"
   )
   public static int field7189;
   @OriginalMember(
      owner = "client!lh",
      name = "O",
      descriptor = "I"
   )
   public static int field7190;
   @OriginalMember(
      owner = "client!lh",
      name = "x",
      descriptor = "I"
   )
   private int field7191;
   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "I"
   )
   private int field7192;
   @OriginalMember(
      owner = "client!lh",
      name = "V",
      descriptor = "I"
   )
   public static int field7193;
   @OriginalMember(
      owner = "client!lh",
      name = "y",
      descriptor = "I"
   )
   public static int field7194;
   @OriginalMember(
      owner = "client!lh",
      name = "C",
      descriptor = "I"
   )
   public static int field7197;
   @OriginalMember(
      owner = "client!lh",
      name = "L",
      descriptor = "I"
   )
   public static int field7198;
   @OriginalMember(
      owner = "client!lh",
      name = "T",
      descriptor = "I"
   )
   public static int field7199;
   @OriginalMember(
      owner = "client!lh",
      name = "J",
      descriptor = "I"
   )
   public static int field7203;
   @OriginalMember(
      owner = "client!lh",
      name = "w",
      descriptor = "I"
   )
   public static int field7207;
   @OriginalMember(
      owner = "client!lh",
      name = "N",
      descriptor = "J"
   )
   private long field7206;
   @OriginalMember(
      owner = "client!lh",
      name = "S",
      descriptor = "Ljq;"
   )
   private class672 field7208;
   @OriginalMember(
      owner = "client!lh",
      name = "R",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field7186;
   @OriginalMember(
      owner = "client!lh",
      name = "H",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field7201;
   @OriginalMember(
      owner = "client!lh",
      name = "I",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field7202;
   @OriginalMember(
      owner = "client!lh",
      name = "W",
      descriptor = "Z"
   )
   private boolean field7204;
   @OriginalMember(
      owner = "client!lh",
      name = "F",
      descriptor = "Z"
   )
   private boolean field7205;
   @OriginalMember(
      owner = "client!lh",
      name = "B",
      descriptor = "Z"
   )
   private boolean field7209;
   @OriginalMember(
      owner = "client!lh",
      name = "P",
      descriptor = "Z"
   )
   private boolean field7210;

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(Z)D"
   )
   public final double method3673(boolean arg0) {
      try {
         if (arg0) {
            return 0.038255533362869396D;
         } else {
            ++field7198;
            return this.field7187;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7211[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method3674(int arg0, boolean arg1) {
      try {
         ++field7193;
         this.field7192 = arg0;
         if (!arg1) {
            this.field7201 = null;
         }

         if (this.field7204) {
            if (this.field7191 < this.field7192) {
               this.field7192 = this.field7191;
            }

            if (this.field7192 < 0) {
               this.field7192 = 0;
            }

            this.field7186.setPostProcessingLevel(this.field7192);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7211[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(Ljava/lang/String;B)J"
   )
   public static final long method3675(String arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         ++field7207;
         if (arg1 > -97) {
            return -76L;
         } else {
            int var3 = arg0.length();
            long var4 = 0L;
            int var6 = 0;
            if (var2) {
               var4 = -var4 + ((var4 << 5) - -((long)arg0.charAt(var6)));
               ++var6;
            }

            while(true) {
               while(~var6 > ~var3) {
                  var4 = -var4 + ((var4 << 5) - -((long)arg0.charAt(var6)));
                  ++var6;
               }

               if (!var2) {
                  return var4;
               }

               var4 = var4;
               ++var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7211[6] + (arg0 != null ? field7211[2] : field7211[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1109(int arg0) {
      try {
         if (this.field7201 != null) {
            this.field7201.method2673();
         }

         ++field7197;
         if (this.field7186 != null) {
            this.field7186.method2673();
            this.field7186 = null;
         }

         if (arg0 < 83) {
            method3678(-119, 8, true);
         }

         if (this.field7202 != null) {
            this.field7202.method2673();
            this.field7202 = null;
         }

         this.field7196.method2673();
         this.field7200.method2673();
         this.field7195.method2673();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7211[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method3676(byte arg0) {
      try {
         ++field7188;
         if (arg0 != -28) {
            this.method3674(-98, true);
         }

         return this.field7206;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7211[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1113(OggPacket arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         label84: {
            ++field7189;
            if (!this.field7204) {
               int var4 = this.field7195.decodeHeader(this.field7196, this.field7200, arg0);
               if (~var4 != -1) {
                  if (var4 < 0) {
                     throw new IllegalStateException(String.valueOf(var4));
                  }
                  break label84;
               }

               this.field7204 = true;
               if (~this.field7196.frameWidth < -2049 || this.field7196.frameHeight > 1024) {
                  throw new IllegalStateException();
               }

               this.field7186 = new DecoderContext(this.field7196, this.field7195);
               this.field7202 = new GranulePos();
               this.field7201 = new Frame(this.field7196.frameWidth, this.field7196.frameHeight);
               this.field7191 = this.field7186.getMaxPostProcessingLevel();
               this.method3674(this.field7192, true);
               if (!var3) {
                  break label84;
               }
            }

            this.field7206 = class162.method1442(14080);
            int var5 = this.field7186.decodePacketIn(arg0, this.field7202);
            if (var5 < 0) {
               throw new IllegalStateException(String.valueOf(var5));
            }

            this.field7186.granuleFrame(this.field7202);
            this.field7187 = this.field7186.granuleTime(this.field7202);
            if (this.field7209) {
               boolean var6 = arg0.isKeyFrame() == 1;
               if (!var6) {
                  return;
               }

               this.field7209 = false;
               if (var3) {
                  return;
               }
            }

            if (!this.field7205 || arg0.isKeyFrame() == 1) {
               if (~this.field7186.decodeFrame(this.field7201) != -1) {
                  throw new IllegalStateException(String.valueOf(var5));
               }

               this.field7210 = true;
            }
         }

         if (arg1 <= 53) {
            this.method3680((class610)null, 21);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7211[9] + (arg0 != null ? field7211[2] : field7211[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method3677(int arg0) {
      try {
         ++field7190;
         return arg0 != 0 ? false : this.field7204;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7211[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method3678(int arg0, int arg1, boolean arg2) {
      try {
         ++field7194;
         class296.method2487(arg1, class499.field7600.method3875(class493.field7455, arg0 + -2620), arg2, -119);
         if (arg0 != 2744) {
            method3675((String)null, (byte)45);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7211[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "c",
      descriptor = "(B)F"
   )
   public final float method3679(byte arg0) {
      try {
         int var2 = -105 % ((arg0 - -36) / 58);
         ++field7203;
         return this.field7204 && !this.field7196.method2672() ? (float)this.field7196.fpsNumerator / (float)this.field7196.fpsDenominator : 0.0F;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7211[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(Lha;I)Ljq;"
   )
   public final class672 method3680(class610 arg0, int arg1) {
      try {
         ++field7185;
         if (this.field7201 == null) {
            return null;
         } else if (!this.field7210 && this.field7208 != null) {
            return this.field7208;
         } else {
            this.field7208 = arg0.method658(this.field7201.pixels, arg1, this.field7201.field4962, this.field7201.field4962, this.field7201.field4961, false);
            this.field7210 = false;
            return this.field7208;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7211[1] + (arg0 != null ? field7211[2] : field7211[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class473(OggStreamState arg0) {
      super(arg0);

      try {
         this.field7195 = new SetupInfo();
         this.field7196 = new TheoraInfo();
         this.field7200 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7211[4] + (arg0 != null ? field7211[2] : field7211[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(IIIIILha;IIILria;II)V"
   )
   public static final void method3681(int arg0, int arg1, int arg2, int arg3, int arg4, class610 arg5, int arg6, int arg7, int arg8, class185 arg9, int arg10, int arg11) {
      try {
         if (~arg0 < ~arg10 && arg8 + arg10 > arg0 && arg11 > arg7 + -13 && arg11 < arg7 - -3 && arg9.field2901) {
            arg1 = arg3;
         }

         ++field7199;
         int[] var12 = null;
         if (!class656.method4832(arg9.field2896, (byte)127)) {
            if (arg9.field2905 == -1) {
               if (!class115.method1069(arg9.field2896, (byte)-80)) {
                  if (class225.method1953(-127, arg9.field2896)) {
                     class333 var13 = class102.field1434.method1411((int)(2147483647L & arg9.field2907 >>> 32), -101);
                     if (var13.field5088 != null) {
                        var13 = var13.method2714(class45.field599, -1);
                     }

                     if (var13 != null) {
                        var12 = var13.field5057;
                     }
                  }
               } else {
                  class795 var14 = (class795)class501.field7665.method3141((long)((int)arg9.field2907), true);
                  if (var14 != null) {
                     class466 var15 = var14.field11592;
                     class344 var16 = var15.field7072;
                     if (var16.field5221 != null) {
                        var16 = var16.method2782((byte)-118, class45.field599);
                     }

                     if (var16 != null) {
                        var12 = var16.field5234;
                     }
                  }
               }
            } else {
               var12 = class247.field3763.method2058(-11, arg9.field2905).field1931;
            }
         } else {
            var12 = class247.field3763.method2058(-11, (int)arg9.field2907).field1931;
         }

         String var17 = class111.method1050(-11382, arg9);
         if (var12 != null) {
            var17 = var17 + class202.method1765(var12, 47);
         }

         if (arg4 <= 62) {
            method3678(91, -97, true);
         }

         class156.field2324.method2413(var17, arg7, class610.field8880, arg10 + 3, 0, (byte)-76, arg1, class82.field1183);
         if (arg9.field2908) {
            class547.field8198.method4959(arg10 - -5 + class355.field5457.method5130(true, var17), arg7 + -12);
         }
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field7211[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7211[2] : field7211[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field7211[2] : field7211[0]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3682(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3683(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
