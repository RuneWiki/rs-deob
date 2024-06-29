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

@OriginalClass("client!saa")
public class class347 extends class29 {
   @OriginalMember(
      owner = "client!saa",
      name = "N",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field4987;
   @OriginalMember(
      owner = "client!saa",
      name = "s",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field4981;
   @OriginalMember(
      owner = "client!saa",
      name = "t",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field4971;
   @OriginalMember(
      owner = "client!saa",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4993 = new String[]{method2747(method2746("4\u000b%7\u0010o")), method2747(method2746(")\u001f(u")), method2747(method2746("<Dj7 ")), method2747(method2746("4\u000b%7\u001co")), method2747(method2746("4\u000b%7a.\u0004-mco")), method2747(method2746("4\u000b%7\u001fo")), method2747(method2746("4\u000b%7\u001ao")), method2747(method2746("4\u000b%7\u0015o")), method2747(method2746("4\u000b%7\u001bo")), method2747(method2746("4\u000b%7\u001eo")), method2747(method2746("4\u000b%7\u0019o")), method2747(method2746("4\u000b%7\u0013o")), method2747(method2746("4\u000b%7\u0014o")), method2747(method2746("4\u000b%7\u0018o"))};
   @OriginalMember(
      owner = "client!saa",
      name = "q",
      descriptor = "I"
   )
   public static int field4990 = -1;
   @OriginalMember(
      owner = "client!saa",
      name = "v",
      descriptor = "Ltv;"
   )
   public static class590 field4975 = new class590(128, 4);
   @OriginalMember(
      owner = "client!saa",
      name = "B",
      descriptor = "Ltv;"
   )
   public static class590 field4992 = new class590(4);
   @OriginalMember(
      owner = "client!saa",
      name = "S",
      descriptor = "D"
   )
   private double field4983;
   @OriginalMember(
      owner = "client!saa",
      name = "r",
      descriptor = "I"
   )
   public static int field4963;
   @OriginalMember(
      owner = "client!saa",
      name = "F",
      descriptor = "I"
   )
   public static int field4964;
   @OriginalMember(
      owner = "client!saa",
      name = "x",
      descriptor = "I"
   )
   public static int field4968;
   @OriginalMember(
      owner = "client!saa",
      name = "Q",
      descriptor = "I"
   )
   private int field4970;
   @OriginalMember(
      owner = "client!saa",
      name = "O",
      descriptor = "I"
   )
   public static int field4972;
   @OriginalMember(
      owner = "client!saa",
      name = "I",
      descriptor = "I"
   )
   public static int field4974;
   @OriginalMember(
      owner = "client!saa",
      name = "w",
      descriptor = "I"
   )
   public static int field4979;
   @OriginalMember(
      owner = "client!saa",
      name = "P",
      descriptor = "I"
   )
   public static int field4980;
   @OriginalMember(
      owner = "client!saa",
      name = "H",
      descriptor = "I"
   )
   public static int field4982;
   @OriginalMember(
      owner = "client!saa",
      name = "M",
      descriptor = "I"
   )
   public static int field4984;
   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "I"
   )
   public static int field4985;
   @OriginalMember(
      owner = "client!saa",
      name = "C",
      descriptor = "I"
   )
   private int field4986;
   @OriginalMember(
      owner = "client!saa",
      name = "K",
      descriptor = "I"
   )
   public static int field4988;
   @OriginalMember(
      owner = "client!saa",
      name = "p",
      descriptor = "J"
   )
   private long field4969;
   @OriginalMember(
      owner = "client!saa",
      name = "L",
      descriptor = "Lgk;"
   )
   public static class504 field4965;
   @OriginalMember(
      owner = "client!saa",
      name = "E",
      descriptor = "Lbo;"
   )
   private class763 field4966;
   @OriginalMember(
      owner = "client!saa",
      name = "D",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field4991;
   @OriginalMember(
      owner = "client!saa",
      name = "u",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field4989;
   @OriginalMember(
      owner = "client!saa",
      name = "R",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field4967;
   @OriginalMember(
      owner = "client!saa",
      name = "A",
      descriptor = "Z"
   )
   private boolean field4973;
   @OriginalMember(
      owner = "client!saa",
      name = "J",
      descriptor = "Z"
   )
   private boolean field4976;
   @OriginalMember(
      owner = "client!saa",
      name = "T",
      descriptor = "Z"
   )
   private boolean field4977;
   @OriginalMember(
      owner = "client!saa",
      name = "y",
      descriptor = "Z"
   )
   private boolean field4978;

   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method2737(int arg0) {
      try {
         ++field4974;
         if (arg0 <= 124) {
            this.field4977 = false;
         }

         return this.field4969;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4993[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "e",
      descriptor = "(I)F"
   )
   public final float method2738(int arg0) {
      try {
         ++field4980;
         if (this.field4973 && !this.field4981.method5383()) {
            if (arg0 >= -75) {
               this.field4977 = true;
            }

            return (float)this.field4981.fpsNumerator / (float)this.field4981.fpsDenominator;
         } else {
            return 0.0F;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4993[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method2739(boolean arg0) {
      try {
         ++field4979;
         if (!arg0) {
            method2741(23, (String)null);
         }

         return this.field4973;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4993[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method242(int arg0, OggPacket arg1) {
      try {
         if (arg0 != 16) {
            field4984 = 114;
         }

         ++field4968;
         if (this.field4973) {
            this.field4969 = class792.method5708(-25005);
            int var3 = this.field4991.decodePacketIn(arg1, this.field4967);
            if (var3 < 0) {
               throw new IllegalStateException(String.valueOf(var3));
            } else {
               this.field4991.granuleFrame(this.field4967);
               this.field4983 = this.field4991.granuleTime(this.field4967);
               if (this.field4977) {
                  boolean var4 = ~arg1.isKeyFrame() == -2;
                  if (!var4) {
                     return;
                  }

                  this.field4977 = false;
               }

               if (!this.field4976 || arg1.isKeyFrame() == 1) {
                  if (this.field4991.decodeFrame(this.field4989) != 0) {
                     throw new IllegalStateException(String.valueOf(var3));
                  }

                  this.field4978 = true;
               }

            }
         } else {
            int var5 = this.field4987.decodeHeader(this.field4981, this.field4971, arg1);
            if (~var5 != -1) {
               if (~var5 > -1) {
                  throw new IllegalStateException(String.valueOf(var5));
               }
            } else {
               this.field4973 = true;
               if (this.field4981.frameWidth > 2048 || this.field4981.frameHeight > 1024) {
                  throw new IllegalStateException();
               }

               this.field4991 = new DecoderContext(this.field4981, this.field4987);
               this.field4967 = new GranulePos();
               this.field4989 = new Frame(this.field4981.frameWidth, this.field4981.frameHeight);
               this.field4986 = this.field4991.getMaxPostProcessingLevel();
               this.method2745(this.field4970, false);
            }

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4993[13] + arg0 + ',' + (arg1 != null ? field4993[2] : field4993[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "c",
      descriptor = "(B)D"
   )
   public final double method2740(byte arg0) {
      try {
         ++field4963;
         return arg0 < 106 ? -0.3804856071861146D : this.field4983;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4993[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method2741(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field4972;
         if (arg1 == null) {
            return false;
         } else if (arg0 != 2048) {
            return true;
         } else {
            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class125.field1560[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               while(~var3 > ~class209.field2582) {
                  if (arg1.equalsIgnoreCase(class125.field1560[var3])) {
                     return true;
                  }

                  ++var3;
               }

               boolean var10000 = arg1.equalsIgnoreCase(class278.field3709.field5662);
               if (!var2) {
                  if (var10000) {
                     return true;
                  }

                  return false;
               }

               if (var10000) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4993[9] + arg0 + ',' + (arg1 != null ? field4993[2] : field4993[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method238(byte arg0) {
      try {
         if (this.field4989 != null) {
            this.field4989.method5384();
         }

         ++field4985;
         if (arg0 == 112) {
            if (this.field4991 != null) {
               this.field4991.method5384();
               this.field4991 = null;
            }

            if (this.field4967 != null) {
               this.field4967.method5384();
               this.field4967 = null;
            }

            this.field4981.method5384();
            this.field4971.method5384();
            this.field4987.method5384();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4993[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(B[FI)[F"
   )
   public static final float[] method2742(byte arg0, float[] arg1, int arg2) {
      try {
         if (arg0 != 46) {
            return null;
         } else {
            ++field4982;
            float[] var3 = new float[arg2];
            class714.method5197(arg1, 0, var3, 0, arg2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4993[0] + arg0 + ',' + (arg1 != null ? field4993[2] : field4993[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2743(int arg0) {
      try {
         field4975 = null;
         if (arg0 == -14100) {
            field4992 = null;
            field4965 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4993[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILha;)Lbo;"
   )
   public final class763 method2744(int arg0, class65 arg1) {
      try {
         ++field4964;
         if (arg0 != 4) {
            this.method2739(false);
         }

         if (this.field4989 == null) {
            return null;
         } else if (!this.field4978 && this.field4966 != null) {
            return this.field4966;
         } else {
            this.field4966 = arg1.method524(this.field4989.pixels, 0, this.field4989.field10830, this.field4989.field10830, this.field4989.field10829, false);
            this.field4978 = false;
            return this.field4966;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4993[10] + arg0 + ',' + (arg1 != null ? field4993[2] : field4993[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method2745(int arg0, boolean arg1) {
      try {
         this.field4970 = arg0;
         ++field4988;
         if (this.field4973) {
            if (this.field4970 > this.field4986) {
               this.field4970 = this.field4986;
            }

            if (~this.field4970 > -1) {
               this.field4970 = 0;
            }

            this.field4991.setPostProcessingLevel(this.field4970);
         }

         if (arg1) {
            this.method2738(-26);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4993[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class347(OggStreamState arg0) {
      super(arg0);

      try {
         this.field4987 = new SetupInfo();
         this.field4981 = new TheoraInfo();
         this.field4971 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4993[4] + (arg0 != null ? field4993[2] : field4993[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2746(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2747(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
