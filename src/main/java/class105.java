import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class105 {
   @OriginalMember(
      owner = "client!qu",
      name = "b",
      descriptor = "Lwe;"
   )
   public class425 field1745;
   @OriginalMember(
      owner = "client!qu",
      name = "c",
      descriptor = "[Lnfa;"
   )
   private class706[] field1747;
   @OriginalMember(
      owner = "client!qu",
      name = "d",
      descriptor = "[Lnfa;"
   )
   public class706[] field1746;
   @OriginalMember(
      owner = "client!qu",
      name = "i",
      descriptor = "Lwe;"
   )
   public class425 field1749;
   @OriginalMember(
      owner = "client!qu",
      name = "e",
      descriptor = "Lcs;"
   )
   private class357 field1748;
   @OriginalMember(
      owner = "client!qu",
      name = "j",
      descriptor = "Z"
   )
   public boolean field1744;
   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1754 = new String[]{method1024(method1023("\u00182\u00128o")), method1024(method1023("\u0012i\u0012W:")), method1024(method1023("\u00182\u0012E.\u0007.HGo")), method1024(method1023("\u00072P\u0015")), method1024(method1023("\u00182\u0012;o")), method1024(method1023("\u00182\u0012:o")), method1024(method1023(":/]\u001d\"\u001bgP\u0010)\u0002.R\u001eg\u000f&U\u0015\"\r}")), method1024(method1023("\u00182\u0012=o"))};
   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "I"
   )
   public static int field1750;
   @OriginalMember(
      owner = "client!qu",
      name = "g",
      descriptor = "I"
   )
   public static int field1752;
   @OriginalMember(
      owner = "client!qu",
      name = "h",
      descriptor = "I"
   )
   public static int field1753;
   @OriginalMember(
      owner = "client!qu",
      name = "f",
      descriptor = "Lqi;"
   )
   public static class591 field1751;

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1019(byte arg0) {
      try {
         if (arg0 >= -11) {
            field1751 = null;
         }

         field1751 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1754[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "([Ltu;Lrk;B)Lud;"
   )
   public static final class39 method1020(class366[] arg0, class35 arg1, byte arg2) {
      boolean var3 = client.field4564;

      try {
         ++field1752;
         int var4 = 0;
         if (var3) {
            if (arg0[var4] == null || ~arg0[var4].field5445 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            while(~var4 > ~arg0.length) {
               if (arg0[var4] == null || ~arg0[var4].field5445 >= -1L) {
                  return null;
               }

               ++var4;
            }

            if (!var3) {
               if (arg2 < 91) {
                  field1751 = null;
               }

               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg0[var7].field5445);
                  ++var7;
               }

               while(true) {
                  while(var7 < arg0.length) {
                     OpenGL.glAttachObjectARB(var5, arg0[var7].field5445);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class140.field2289, 0);
                  if (!var3) {
                     if (class140.field2289[0] == 0) {
                        if (class140.field2289[0] == 0) {
                           System.out.println(field1754[6]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class140.field2289, 1);
                        if (~class140.field2289[1] < -2) {
                           byte[] var8 = new byte[class140.field2289[1]];
                           OpenGL.glGetInfoLogARB(var5, class140.field2289[1], class140.field2289, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class140.field2289[0] == -1) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg0[var9].field5445);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg0.length) {
                                 OpenGL.glDetachObjectARB(var5, arg0[var9].field5445);
                                 ++var9;
                              }

                              OpenGL.glDeleteObjectARB(var5);
                              if (!var3) {
                                 return null;
                              }

                              ++var9;
                           }
                        }
                     }

                     return new class39(arg1, var5, arg0);
                  }

                  ++var7;
               }
            }

            if (arg2 >= 0) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1754[5] + (arg0 != null ? field1754[1] : field1754[3]) + ',' + (arg1 != null ? field1754[1] : field1754[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1021(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (this.field1745 == null) {
            if (class211.field3150 == null) {
               byte[] var3 = class728.method5260(8, 128, 16, 0.6F, 128, new class415(419684), 16.0F, 4.0F, 0.5F, 4.0F, -112);
               class211.field3150 = class194.method1687(false, arg0 + -203, var3);
            }

            byte[] var4 = class167.method1515((byte)99, class211.field3150, false);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            int var7 = 0;
            if (var2 || ~var7 > -17) {
               do {
                  int var8 = var7 * 16384;
                  int var9 = var8;
                  int var10 = 0;
                  if (var2 || var10 < 128) {
                     do {
                        int var11 = var10 * 128 + var9;
                        int var12 = (127 & var10 + -1) * 128 + var9;
                        int var13 = var9 - -((127 & var10 - -1) * 128);
                        int var14 = 0;
                        if (var2 || ~var14 > -129) {
                           do {
                              float var15 = (float)((255 & var4[var12 + var14]) + -(var4[var13 + var14] & 255));
                              float var16 = (float)((var4[(127 & var14 + -1) + var11] & 255) + -(255 & var4[var11 - -(127 & var14 + 1)]));
                              float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                              var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                              var5[var6++] = (byte)((int)(var17 * 128.0F + 127.0F));
                              var5[var6++] = (byte)((int)(var15 * var17 + 127.0F));
                              var5[var6++] = var4[var8++];
                              ++var14;
                           } while(~var14 > -129);
                        }

                        ++var10;
                     } while(var10 < 128);
                  }

                  ++var7;
               } while(~var7 > -17);
            }

            this.field1745 = this.field1748.method1185(true, 128, 16, 128, var5, class296.field4146);
         }

         ++field1753;
         if (arg0 != 66) {
            this.field1744 = false;
         }

         return this.field1745 != null;
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field1754[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "<init>",
      descriptor = "(Lcs;)V"
   )
   public class105(class357 arg0) {
      boolean var2 = client.field4564;
      super();
      this.field1745 = null;
      this.field1747 = null;
      this.field1746 = null;
      this.field1749 = null;

      try {
         this.field1748 = arg0;
         this.field1744 = this.field1748.field5242;
         if (this.field1744 && !this.field1748.method1186(class209.field3106, (byte)113, class434.field6278)) {
            this.field1744 = false;
         }

         if (this.field1744 || this.field1748.method1190(class434.field6278, -115, class209.field3106)) {
            class616.method4518((byte)-75);
            if (this.field1744) {
               byte[] var3 = class167.method1515((byte)99, class299.field4192, false);
               this.field1749 = this.field1748.method1185(true, 128, 16, 128, var3, class434.field6278);
               byte[] var4 = class167.method1515((byte)99, class323.field4658, false);
               this.field1748.method1185(true, 128, 16, 128, var4, class434.field6278);
            } else {
               int var10000;
               label55: {
                  this.field1746 = new class706[16];
                  int var5 = 0;
                  if (var2) {
                     var10000 = 32768;
                  } else if (var5 >= 16) {
                     this.field1747 = new class706[16];
                     var10000 = 0;
                     if (!var2) {
                        break label55;
                     }
                  } else {
                     var10000 = 32768;
                  }

                  while(true) {
                     byte[] var6 = class208.method1773(var10000, 59, var5 * 128 * 256, class299.field4192);
                     this.field1746[var5] = this.field1748.method2790(var6, 121, true, 128, class434.field6278, 128);
                     ++var5;
                     if (var5 >= 16) {
                        this.field1747 = new class706[16];
                        var10000 = 0;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = 32768;
                     }
                  }
               }

               int var7 = var10000;
               if (var2 || var7 < 16) {
                  do {
                     byte[] var8 = class208.method1773(32768, -12, var7 * 128 * 2 * 128, class323.field4658);
                     this.field1747[var7] = this.field1748.method2790(var8, 37, true, 128, class434.field6278, 128);
                     ++var7;
                  } while(var7 < 16);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1754[2] + (arg0 != null ? field1754[1] : field1754[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1022(int arg0) {
      try {
         ++field1750;
         if (arg0 != 4) {
            field1751 = null;
         }

         if (this.field1744) {
            return this.field1749 != null;
         } else {
            return this.field1746 != null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1754[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1023(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1024(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
