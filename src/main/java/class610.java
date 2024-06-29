import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class610 extends class537 {
   @OriginalMember(
      owner = "client!pm",
      name = "H",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field8943;
   @OriginalMember(
      owner = "client!pm",
      name = "v",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field8933;
   @OriginalMember(
      owner = "client!pm",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8947 = new String[]{method4450(method4449("$h%2\u0019")), method4450(method4449("/+%YL")), method4450(method4449("13gp")), method4450(method4449("/+%]L")), method4450(method4449("/+%TL")), method4450(method4449("/+%[L")), method4450(method4449("/+%_L")), method4450(method4449("/+%XL")), method4450(method4449("/+%^L")), method4450(method4449("/+% \r1/\u007f\"L")), method4450(method4449("/+%ZL"))};
   @OriginalMember(
      owner = "client!pm",
      name = "t",
      descriptor = "D"
   )
   private double field8932;
   @OriginalMember(
      owner = "client!pm",
      name = "D",
      descriptor = "I"
   )
   public static int field8930;
   @OriginalMember(
      owner = "client!pm",
      name = "B",
      descriptor = "I"
   )
   public static int field8931;
   @OriginalMember(
      owner = "client!pm",
      name = "F",
      descriptor = "I"
   )
   public static int field8935;
   @OriginalMember(
      owner = "client!pm",
      name = "x",
      descriptor = "I"
   )
   private int field8936;
   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "I"
   )
   public static int field8939;
   @OriginalMember(
      owner = "client!pm",
      name = "E",
      descriptor = "I"
   )
   public static int field8941;
   @OriginalMember(
      owner = "client!pm",
      name = "A",
      descriptor = "I"
   )
   public static int field8942;
   @OriginalMember(
      owner = "client!pm",
      name = "y",
      descriptor = "I"
   )
   public static int field8944;
   @OriginalMember(
      owner = "client!pm",
      name = "r",
      descriptor = "I"
   )
   public static int field8945;
   @OriginalMember(
      owner = "client!pm",
      name = "C",
      descriptor = "Lsd;"
   )
   public static class101 field8937;
   @OriginalMember(
      owner = "client!pm",
      name = "u",
      descriptor = "Lwh;"
   )
   private class157 field8946;
   @OriginalMember(
      owner = "client!pm",
      name = "s",
      descriptor = "Lnc;"
   )
   private class26 field8938;
   @OriginalMember(
      owner = "client!pm",
      name = "w",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field8940;
   @OriginalMember(
      owner = "client!pm",
      name = "G",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field8934;

   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1467(int arg0) {
      try {
         if (this.field8934 != null) {
            this.field8934.method5403();
         }

         ++field8941;
         if (this.field8940 != null) {
            this.field8940.method5403();
         }

         if (arg0 != -25083) {
            this.method1467(28);
         }

         this.field8933.method5403();
         this.field8943.method5403();
         if (this.field8938 != null) {
            this.field8938.method183(-121);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8947[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1468(OggPacket arg0, int arg1) {
      int var3 = client.field4530;

      try {
         label82: {
            ++field8930;
            if (~super.field7848 <= -4) {
               if (this.field8934.synthesis(arg0) == 0) {
                  this.field8940.blockIn(this.field8934);
               }

               float[][] var4 = this.field8940.pcmOut(this.field8943.channels);
               this.field8932 = this.field8940.granuleTime();
               if (this.field8932 == -1.0D) {
                  this.field8932 = (double)((float)this.field8936 / (float)this.field8943.rate);
               }

               this.field8940.read(var4[0].length);
               this.field8936 += var4[0].length;
               class443 var5 = this.field8938.method180((byte)53, this.field8932, var4[0].length);
               class351.method2744(var4, 68, var5.field6749);
               int var6 = 0;
               if (var3 != 0) {
                  var5.field6749[var6] = this.field8946.method1305(var5.field6749[var6], (byte)110);
                  ++var6;
               }

               while(true) {
                  while(this.field8943.channels > var6) {
                     var5.field6749[var6] = this.field8946.method1305(var5.field6749[var6], (byte)110);
                     ++var6;
                  }

                  this.field8938.method174((byte)81, var5);
                  if (var3 == 0) {
                     if (var3 == 0) {
                        break label82;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            int var7 = this.field8943.headerIn(this.field8933, arg0);
            if (~var7 > -1) {
               throw new IllegalStateException(String.valueOf(var7));
            }

            if (~super.field7848 == -3) {
               if (~this.field8943.channels < -3 || ~this.field8943.channels > -2) {
                  throw new RuntimeException(String.valueOf(this.field8943.channels));
               }

               this.field8940 = new DSPState(this.field8943);
               this.field8934 = new VorbisBlock(this.field8940);
               this.field8946 = new class157(this.field8943.rate, class335.field4787);
               this.field8938 = new class26(this.field8943.channels);
            }
         }

         if (arg1 != 0) {
            this.field8938 = null;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field8947[1] + (arg0 != null ? field8947[0] : field8947[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class610(OggStreamState arg0) {
      super(arg0);

      try {
         this.field8943 = new VorbisInfo();
         this.field8933 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8947[9] + (arg0 != null ? field8947[0] : field8947[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4443(int arg0) {
      try {
         if (arg0 == -1065556191) {
            field8937 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8947[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "f",
      descriptor = "(I)D"
   )
   public final double method4444(int arg0) {
      try {
         ++field8942;
         if (arg0 != 0) {
            return -0.8005099377681936D;
         } else {
            double var2 = this.field8932;
            if (this.field8938 != null) {
               var2 = this.field8938.method177(true);
               if (var2 < 0.0D) {
                  var2 = this.field8932;
               }
            }

            return var2 - (double)(256.0F / (float)class335.field4787);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8947[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4445(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "(B)Lnc;"
   )
   public final class26 method4446(byte arg0) {
      try {
         if (arg0 != 69) {
            this.method4444(-2);
         }

         ++field8944;
         return this.field8938;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8947[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(ILhv;)Lhv;"
   )
   public static final class544 method4447(int arg0, class544 arg1) {
      int var2 = client.field4530;

      try {
         ++field8931;
         if (arg1.field7968 != -1) {
            return class543.method4011(arg1.field7968, (byte)125);
         } else if (arg0 != 15178) {
            return null;
         } else {
            int var3 = arg1.field8054 >>> 16;
            class123 var4 = new class123(class573.field8525);
            class624 var5 = (class624)var4.method1015(true);
            if (var2 != 0) {
               if (~var5.field9087 == ~var3) {
                  return class543.method4011((int)var5.field5280, (byte)-111);
               }

               var5 = (class624)var4.method1013(-1);
            }

            while(true) {
               while(var5 != null) {
                  if (~var5.field9087 == ~var3) {
                     return class543.method4011((int)var5.field5280, (byte)-111);
                  }

                  var5 = (class624)var4.method1013(-1);
               }

               if (var2 == 0) {
                  return null;
               }

               var5 = (class624)var4.method1013(-1);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8947[7] + arg0 + ',' + (arg1 != null ? field8947[0] : field8947[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method4448(byte arg0) {
      try {
         if (arg0 != -9) {
            this.field8933 = null;
         }

         ++field8945;
         return this.field8938 != null ? this.field8938.method188(true) : 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8947[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
