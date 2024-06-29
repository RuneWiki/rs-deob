import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class607 extends class153 {
   @OriginalMember(
      owner = "client!kha",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8727 = new String[]{method4460(method4459("^\u0010!X\u0014\u001d")), method4460(method4459("^\u0010!X\u0013\u001d")), method4460(method4459("^\u0010!X\u0011\u001d")), method4460(method4459("^\u0010!X\u0010\u001d")), method4460(method4459("^\u0010!X\u0016\u001d")), method4460(method4459("^\u0010!X\u0012\u001d")), method4460(method4459("^\u0010!X\u001d\u001d")), method4460(method4459("^\u0010!X\u0017\u001d")), method4460(method4459("NVnX(")), method4460(method4459("[\r,\u001a")), method4460(method4459("f-\u0002")), method4460(method4459("^\u0010!X\u001c\u001d"))};
   @OriginalMember(
      owner = "client!kha",
      name = "A",
      descriptor = "Lgh;"
   )
   public static class572 field8715 = new class572(85, 1);
   @OriginalMember(
      owner = "client!kha",
      name = "E",
      descriptor = "Lgk;"
   )
   public static class498 field8722 = new class498();
   @OriginalMember(
      owner = "client!kha",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field8726 = new int[64];
   @OriginalMember(
      owner = "client!kha",
      name = "K",
      descriptor = "F"
   )
   private float field8714;
   @OriginalMember(
      owner = "client!kha",
      name = "D",
      descriptor = "F"
   )
   private float field8716;
   @OriginalMember(
      owner = "client!kha",
      name = "u",
      descriptor = "I"
   )
   public static int field8708;
   @OriginalMember(
      owner = "client!kha",
      name = "w",
      descriptor = "I"
   )
   public static int field8709;
   @OriginalMember(
      owner = "client!kha",
      name = "y",
      descriptor = "I"
   )
   public static int field8710;
   @OriginalMember(
      owner = "client!kha",
      name = "s",
      descriptor = "I"
   )
   public static int field8711;
   @OriginalMember(
      owner = "client!kha",
      name = "G",
      descriptor = "I"
   )
   public static int field8713;
   @OriginalMember(
      owner = "client!kha",
      name = "J",
      descriptor = "I"
   )
   public static int field8717;
   @OriginalMember(
      owner = "client!kha",
      name = "B",
      descriptor = "I"
   )
   private int field8718;
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "I"
   )
   private int field8721;
   @OriginalMember(
      owner = "client!kha",
      name = "I",
      descriptor = "I"
   )
   public static int field8723;
   @OriginalMember(
      owner = "client!kha",
      name = "C",
      descriptor = "I"
   )
   public static int field8725;
   @OriginalMember(
      owner = "client!kha",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field8719;
   @OriginalMember(
      owner = "client!kha",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   private String field8720;
   @OriginalMember(
      owner = "client!kha",
      name = "H",
      descriptor = "Ljava/lang/String;"
   )
   private String field8724;
   @OriginalMember(
      owner = "client!kha",
      name = "F",
      descriptor = "[Ljfa;"
   )
   public static class303[] field8712;

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1418(OggPacket arg0, int arg1) {
      try {
         if (arg1 < 92) {
            field8712 = null;
         }

         ++field8710;
         if (super.field2443 <= 0 || field8727[10].equals(this.field8724)) {
            class473 var3 = new class473(arg0.getData());
            int var4 = var3.method3564((byte)-75);
            if (~super.field2443 >= -9) {
               if ((128 | var4) == 0) {
                  throw new IllegalStateException();
               }

               if (~super.field2443 == -1) {
                  var3.field6907 += 23;
                  this.field8721 = var3.method3534((byte)115);
                  this.field8718 = var3.method3534((byte)116);
                  if (this.field8721 != 0 && this.field8718 != 0) {
                     class473 var5 = new class473(16);
                     var3.method3562(0, var5.field6889, -112, 16);
                     this.field8720 = var5.method3566(-16496688);
                     var5.field6907 = 0;
                     var3.method3562(0, var5.field6889, -121, 16);
                     this.field8724 = var5.method3566(-16496688);
                     return;
                  }

                  throw new IllegalStateException();
               }
            } else {
               if (~var4 == -1) {
                  long var6 = var3.method3576(false);
                  long var8 = var3.method3576(false);
                  long var10 = var3.method3576(false);
                  if (var6 < 0L || ~var8 > -1L || ~var10 > -1L || ~var10 < ~var6) {
                     throw new IllegalStateException();
                  }

                  this.field8716 = (float)((long)this.field8718 * var6) / (float)this.field8721;
                  this.field8714 = (float)((var6 - -var8) * (long)this.field8718) / (float)this.field8721;
                  int var12 = var3.method3534((byte)125);
                  if (~var12 > -1 || var12 > var3.field6889.length + -var3.field6907) {
                     throw new IllegalStateException();
                  }

                  this.field8719 = class319.method2494(125, var12, var3.field6907, var3.field6889);
               }

               if (~(var4 | 128) != -1) {
                  return;
               }
            }

         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field8727[7] + (arg0 != null ? field8727[8] : field8727[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class607(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!kha",
      name = "c",
      descriptor = "(Z)Ljava/lang/String;"
   )
   public final String method4452(boolean arg0) {
      try {
         if (arg0) {
            method4454(true, '9');
         }

         ++field8711;
         return this.field8720;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8727[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(I)F"
   )
   public final float method4453(int arg0) {
      try {
         if (arg0 != 0) {
            return 2.5167615F;
         } else {
            ++field8708;
            return this.field8714;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8727[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1419(byte arg0) {
      try {
         if (arg0 < 65) {
            this.field8718 = -96;
         }

         ++field8709;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8727[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(ZC)C"
   )
   public static final char method4454(boolean arg0, char arg1) {
      try {
         ++field8725;
         if (!arg0) {
            return 'H';
         } else if (~arg1 != -33 && ~arg1 != -161 && ~arg1 != -96 && ~arg1 != -46) {
            if (~arg1 != -92 && ~arg1 != -94 && arg1 != '#') {
               if (arg1 != 224 && arg1 != 225 && arg1 != 226 && ~arg1 != -229 && ~arg1 != -228 && ~arg1 != -193 && arg1 != 193 && arg1 != 194 && arg1 != 196 && ~arg1 != -196) {
                  if (~arg1 != -233 && arg1 != 233 && arg1 != 234 && arg1 != 235 && ~arg1 != -201 && arg1 != 201 && ~arg1 != -203 && ~arg1 != -204) {
                     if (arg1 != 237 && ~arg1 != -239 && ~arg1 != -240 && arg1 != 205 && arg1 != 206 && ~arg1 != -208) {
                        if (~arg1 != -243 && arg1 != 243 && ~arg1 != -245 && arg1 != 246 && arg1 != 245 && arg1 != 210 && arg1 != 211 && arg1 != 212 && arg1 != 214 && arg1 != 213) {
                           if (~arg1 != -250 && arg1 != 250 && arg1 != 251 && ~arg1 != -253 && arg1 != 217 && arg1 != 218 && ~arg1 != -220 && arg1 != 220) {
                              if (arg1 != 231 && arg1 != 199) {
                                 if (arg1 != 255 && arg1 != 376) {
                                    if (arg1 != 241 && arg1 != 209) {
                                       if (arg1 != 223) {
                                          return Character.toLowerCase(arg1);
                                       } else if (!client.field4564) {
                                          return 'b';
                                       } else {
                                          return '_';
                                       }
                                    } else {
                                       return 'n';
                                    }
                                 } else {
                                    return 'y';
                                 }
                              } else {
                                 return 'c';
                              }
                           } else {
                              return 'u';
                           }
                        } else {
                           return 'o';
                        }
                     } else {
                        return 'i';
                     }
                  } else {
                     return 'e';
                  }
               } else {
                  return 'a';
               }
            } else {
               return arg1;
            }
         } else {
            return '_';
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8727[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(Z)Ljava/lang/String;"
   )
   public final String method4455(boolean arg0) {
      try {
         if (!arg0) {
            this.method1419((byte)-85);
         }

         ++field8717;
         return this.field8719;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8727[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "c",
      descriptor = "(B)F"
   )
   public final float method4456(byte arg0) {
      try {
         if (arg0 < 25) {
            field8726 = null;
         }

         ++field8713;
         return this.field8716;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8727[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4457(byte arg0) {
      try {
         field8715 = null;
         if (arg0 != -28) {
            field8722 = null;
         }

         field8712 = null;
         field8726 = null;
         field8722 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8727[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(B[B)Ltd;"
   )
   public static final class476 method4458(byte arg0, byte[] arg1) {
      try {
         ++field8723;
         if (arg1 == null) {
            throw new RuntimeException("");
         } else {
            if (arg0 > -116) {
               method4458((byte)82, (byte[])null);
            }

            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                  MediaTracker var3 = new MediaTracker(class490.field7150);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class490.field7150);
                  int var5 = var2.getHeight(class490.field7150);
                  if (!var3.isErrorAny() && ~var4 <= -1 && var5 >= 0) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class444.field6473.method696(var5, var4, 0, -103, var4, var6);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8727[11] + arg0 + ',' + (arg1 != null ? field8727[8] : field8727[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4459(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4460(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
