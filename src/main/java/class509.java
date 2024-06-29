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

@OriginalClass("client!ee")
public class class509 extends class409 {
   @OriginalMember(
      owner = "client!ee",
      name = "u",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field7087;
   @OriginalMember(
      owner = "client!ee",
      name = "G",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field7092;
   @OriginalMember(
      owner = "client!ee",
      name = "Q",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field7082;
   @OriginalMember(
      owner = "client!ee",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7104 = new String[]{method3848(method3847("7\u0003@\r:")), method3848(method3847("7\u0003@\u0000:")), method3848(method3847("<\u0013\u0002&")), method3848(method3847(")H@do")), method3848(method3847("7\u0003@\u000e:")), method3848(method3847("7\u0003@\u0002:")), method3848(method3847("7\u0003@\u000f:")), method3848(method3847("7\u0003@\u0003:")), method3848(method3847("7\u0003@\u0006:")), method3848(method3847("7\u0003@\u000b:")), method3848(method3847("7\u0003@\f:")), method3848(method3847("7\u0003@\b:")), method3848(method3847("7\u0003@\t:")), method3848(method3847("7\u0003@\u0001:")), method3848(method3847("7\u0003@v{<\u000f\u001at:"))};
   @OriginalMember(
      owner = "client!ee",
      name = "t",
      descriptor = "Lifa;"
   )
   public static class75 field7100 = new class75(0, 8);
   @OriginalMember(
      owner = "client!ee",
      name = "B",
      descriptor = "Loca;"
   )
   public static class642 field7102 = null;
   @OriginalMember(
      owner = "client!ee",
      name = "S",
      descriptor = "Laka;"
   )
   public static class418 field7103 = new class418(30, 4);
   @OriginalMember(
      owner = "client!ee",
      name = "D",
      descriptor = "D"
   )
   private double field7088;
   @OriginalMember(
      owner = "client!ee",
      name = "A",
      descriptor = "I"
   )
   public static int field7076;
   @OriginalMember(
      owner = "client!ee",
      name = "K",
      descriptor = "I"
   )
   public static int field7080;
   @OriginalMember(
      owner = "client!ee",
      name = "I",
      descriptor = "I"
   )
   private int field7081;
   @OriginalMember(
      owner = "client!ee",
      name = "T",
      descriptor = "I"
   )
   public static int field7083;
   @OriginalMember(
      owner = "client!ee",
      name = "N",
      descriptor = "I"
   )
   public static int field7084;
   @OriginalMember(
      owner = "client!ee",
      name = "L",
      descriptor = "I"
   )
   private int field7085;
   @OriginalMember(
      owner = "client!ee",
      name = "s",
      descriptor = "I"
   )
   public static int field7089;
   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "I"
   )
   public static int field7090;
   @OriginalMember(
      owner = "client!ee",
      name = "P",
      descriptor = "I"
   )
   public static int field7091;
   @OriginalMember(
      owner = "client!ee",
      name = "r",
      descriptor = "I"
   )
   public static int field7095;
   @OriginalMember(
      owner = "client!ee",
      name = "C",
      descriptor = "I"
   )
   public static int field7098;
   @OriginalMember(
      owner = "client!ee",
      name = "x",
      descriptor = "I"
   )
   public static int field7099;
   @OriginalMember(
      owner = "client!ee",
      name = "E",
      descriptor = "I"
   )
   public static int field7101;
   @OriginalMember(
      owner = "client!ee",
      name = "H",
      descriptor = "J"
   )
   private long field7078;
   @OriginalMember(
      owner = "client!ee",
      name = "O",
      descriptor = "Lpd;"
   )
   private class648 field7079;
   @OriginalMember(
      owner = "client!ee",
      name = "M",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field7094;
   @OriginalMember(
      owner = "client!ee",
      name = "y",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field7075;
   @OriginalMember(
      owner = "client!ee",
      name = "J",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field7077;
   @OriginalMember(
      owner = "client!ee",
      name = "w",
      descriptor = "Z"
   )
   private boolean field7086;
   @OriginalMember(
      owner = "client!ee",
      name = "F",
      descriptor = "Z"
   )
   private boolean field7093;
   @OriginalMember(
      owner = "client!ee",
      name = "R",
      descriptor = "Z"
   )
   private boolean field7096;
   @OriginalMember(
      owner = "client!ee",
      name = "v",
      descriptor = "Z"
   )
   private boolean field7097;

   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "(B)F"
   )
   public final float method3837(byte arg0) {
      try {
         if (arg0 != 45) {
            this.method3843((byte)-24, (class479)null);
         }

         ++field7076;
         return this.field7097 && !this.field7092.method1218() ? (float)this.field7092.fpsNumerator / (float)this.field7092.fpsDenominator : 0.0F;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7104[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method3838(int arg0) {
      try {
         ++field7084;
         return arg0 != 28885 ? false : this.field7097;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7104[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field7098;
         if (arg4 == -2049) {
            if (~class586.field8647 <= ~arg3 && arg0 >= class577.field8561) {
               boolean var7;
               label144: {
                  if (~class415.field5689 < ~arg5) {
                     var7 = false;
                     arg5 = class415.field5689;
                     if (!var6) {
                        break label144;
                     }
                  }

                  if (class282.field3921 < arg5) {
                     var7 = false;
                     arg5 = class282.field3921;
                     if (!var6) {
                        break label144;
                     }
                  }

                  var7 = true;
               }

               boolean var8;
               label145: {
                  if (class415.field5689 > arg2) {
                     var8 = false;
                     arg2 = class415.field5689;
                     if (!var6) {
                        break label145;
                     }
                  }

                  if (class282.field3921 >= arg2) {
                     var8 = true;
                     if (!var6) {
                        break label145;
                     }
                  }

                  arg2 = class282.field3921;
                  var8 = false;
               }

               label116: {
                  if (arg3 < class577.field8561) {
                     arg3 = class577.field8561;
                     if (!var6) {
                        break label116;
                     }
                  }

                  class385.method3045(arg1, arg2, class237.field3001[arg3++], arg5, (byte)-71);
               }

               label111: {
                  if (~class586.field8647 <= ~arg0) {
                     class385.method3045(arg1, arg2, class237.field3001[arg0--], arg5, (byte)-98);
                     if (!var6) {
                        break label111;
                     }
                  }

                  arg0 = class586.field8647;
               }

               if (var7 && var8) {
                  int var9 = arg3;
                  if (var6 || ~arg0 <= ~arg3) {
                     do {
                        int[] var10 = class237.field3001[var9];
                        var10[arg5] = var10[arg2] = arg1;
                        ++var9;
                     } while(~arg0 <= ~var9);

                  }
               } else {
                  if (!var7) {
                     if (var8) {
                        int var11 = arg3;
                        if (var6) {
                           class237.field3001[arg3][arg2] = arg1;
                           var11 = arg3 + 1;
                        }

                        while(true) {
                           while(~arg0 <= ~var11) {
                              class237.field3001[var11][arg2] = arg1;
                              ++var11;
                           }

                           if (!var6) {
                              return;
                           }

                           ++var11;
                        }
                     }
                  } else {
                     int var12 = arg3;
                     if (var6 || arg0 >= arg3) {
                        do {
                           class237.field3001[var12][arg5] = arg1;
                           ++var12;
                        } while(arg0 >= var12);
                     }
                  }

               }
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field7104[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3840(byte arg0) {
      try {
         field7103 = null;
         field7100 = null;
         if (arg0 < -81) {
            field7102 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7104[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class509(OggStreamState arg0) {
      super(arg0);

      try {
         this.field7087 = new SetupInfo();
         this.field7092 = new TheoraInfo();
         this.field7082 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7104[14] + (arg0 != null ? field7104[3] : field7104[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "d",
      descriptor = "(I)Lija;"
   )
   public static final class160 method3841(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field7099;
         if (class326.field4479 != null && class217.field2750 != null) {
            if (arg0 > -127) {
               return null;
            } else {
               class160 var2 = (class160)class217.field2750.method2311((byte)127);
               if (!var1 && var2 == null) {
                  return null;
               } else {
                  do {
                     class519 var3 = class326.field4471.method4937(var2.field2052, true);
                     if (var3 != null && var3.field7293 && var3.method3901((byte)72, class326.field4472)) {
                        return var2;
                     }

                     var2 = (class160)class217.field2750.method2311((byte)127);
                  } while(var2 != null);

                  return null;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7104[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method1015(int arg0, OggPacket arg1) {
      try {
         ++field7089;
         if (arg0 == 0) {
            if (!this.field7097) {
               int var3 = this.field7087.decodeHeader(this.field7092, this.field7082, arg1);
               if (var3 == 0) {
                  this.field7097 = true;
                  if (~this.field7092.frameWidth >= -2049 && this.field7092.frameHeight <= 1024) {
                     this.field7094 = new DecoderContext(this.field7092, this.field7087);
                     this.field7077 = new GranulePos();
                     this.field7075 = new Frame(this.field7092.frameWidth, this.field7092.frameHeight);
                     this.field7085 = this.field7094.getMaxPostProcessingLevel();
                     this.method3844(this.field7081, (byte)-47);
                     return;
                  }

                  throw new IllegalStateException();
               }

               if (var3 < 0) {
                  throw new IllegalStateException(String.valueOf(var3));
               }
            } else {
               this.field7078 = class163.method1353(-124);
               int var4 = this.field7094.decodePacketIn(arg1, this.field7077);
               if (~var4 > -1) {
                  throw new IllegalStateException(String.valueOf(var4));
               }

               this.field7094.granuleFrame(this.field7077);
               this.field7088 = this.field7094.granuleTime(this.field7077);
               if (this.field7096) {
                  boolean var5 = ~arg1.isKeyFrame() == -2;
                  if (!var5) {
                     return;
                  }

                  this.field7096 = false;
               }

               if (!this.field7093 || ~arg1.isKeyFrame() == -2) {
                  if (this.field7094.decodeFrame(this.field7075) != 0) {
                     throw new IllegalStateException(String.valueOf(var4));
                  }

                  this.field7086 = true;
               }
            }

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7104[10] + arg0 + ',' + (arg1 != null ? field7104[3] : field7104[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1017(int arg0) {
      try {
         if (this.field7075 != null) {
            this.field7075.method1219();
         }

         ++field7080;
         if (this.field7094 != null) {
            this.field7094.method1219();
            this.field7094 = null;
         }

         if (this.field7077 != null) {
            this.field7077.method1219();
            this.field7077 = null;
         }

         this.field7092.method1219();
         if (arg0 < -126) {
            this.field7082.method1219();
            this.field7087.method1219();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7104[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(B)D"
   )
   public final double method3842(byte arg0) {
      try {
         ++field7101;
         return arg0 > -38 ? -0.8488110386171841D : this.field7088;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7104[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(BLha;)Lpd;"
   )
   public final class648 method3843(byte arg0, class479 arg1) {
      try {
         ++field7083;
         if (this.field7075 == null) {
            return null;
         } else if (!this.field7086 && this.field7079 != null) {
            return this.field7079;
         } else {
            this.field7079 = arg1.method398(this.field7075.pixels, 0, this.field7075.field1891, this.field7075.field1891, this.field7075.field1890, false);
            if (arg0 != -59) {
               return null;
            } else {
               this.field7086 = false;
               return this.field7079;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7104[1] + arg0 + ',' + (arg1 != null ? field7104[3] : field7104[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(IB)V"
   )
   private final void method3844(int arg0, byte arg1) {
      try {
         this.field7081 = arg0;
         ++field7090;
         if (arg1 >= -34) {
            this.method3842((byte)-105);
         }

         if (this.field7097) {
            if (~this.field7085 > ~this.field7081) {
               this.field7081 = this.field7085;
            }

            if (this.field7081 < 0) {
               this.field7081 = 0;
            }

            this.field7094.setPostProcessingLevel(this.field7081);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7104[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method3845(int arg0) {
      try {
         ++field7091;
         if (arg0 != 0) {
            this.method3838(-17);
         }

         return this.field7078;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7104[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(IIIIIIZII)V"
   )
   public static final void method3846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
      try {
         ++field7095;
         if (~arg4 <= -2 && ~arg7 <= -2 && arg4 <= class273.field3491 + -2 && class211.field2689 + -2 >= arg7) {
            int var9 = arg8;
            if (arg8 < 3 && class738.method5357(arg7, arg4, -20749)) {
               var9 = arg8 + 1;
            }

            if (~class757.field11093.field10978.method2092(-18033) == -1 && !class684.method4977(class600.field8858, -124, arg7, var9, arg4)) {
               return;
            }

            if (class548.field8080 == null) {
               return;
            }

            class456.field6286.method4598(class629.field9294, 22, arg7, class324.field4438[arg8], arg5, arg4, arg8);
            if (~arg3 <= -1) {
               int var10 = class757.field11093.field11011.method4665(-18033);
               class757.field11093.method5438(true, class757.field11093.field11011, 1);
               class456.field6286.method4600(arg0, class324.field4438[arg8], arg3, arg2, arg8, arg1, arg4, var9, class629.field9294, arg7, -18899);
               class757.field11093.method5438(true, class757.field11093.field11011, var10);
            }
         }

         if (!arg6) {
            field7103 = null;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field7104[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
