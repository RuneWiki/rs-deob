import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class252 extends class604 {
   @OriginalMember(
      owner = "client!rga",
      name = "l",
      descriptor = "Lor;"
   )
   private class670 field3203;
   @OriginalMember(
      owner = "client!rga",
      name = "o",
      descriptor = "Lfh;"
   )
   private class681 field3199;
   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3205 = new String[]{method1917(method1916("+Oy|j")), method1917(method1916(">\u0014;>")), method1917(method1916("\"\u00066|\\x")), method1917(method1916("\"\u00066|Px")), method1917(method1916("\"\u00066|+9\u000f>&)x")), method1917(method1916("\"\u00066|Qx")), method1917(method1916("\"\u00066|]x")), method1917(method1916("\"\u00066|^x")), method1917(method1916("\"\u00066|_x"))};
   @OriginalMember(
      owner = "client!rga",
      name = "w",
      descriptor = "I"
   )
   public static int field3200 = 1405;
   @OriginalMember(
      owner = "client!rga",
      name = "p",
      descriptor = "I"
   )
   public static int field3204 = 1408;
   @OriginalMember(
      owner = "client!rga",
      name = "r",
      descriptor = "I"
   )
   public static int field3192;
   @OriginalMember(
      owner = "client!rga",
      name = "t",
      descriptor = "I"
   )
   public static int field3193;
   @OriginalMember(
      owner = "client!rga",
      name = "k",
      descriptor = "I"
   )
   public static int field3194;
   @OriginalMember(
      owner = "client!rga",
      name = "s",
      descriptor = "I"
   )
   public static int field3195;
   @OriginalMember(
      owner = "client!rga",
      name = "n",
      descriptor = "I"
   )
   public static int field3196;
   @OriginalMember(
      owner = "client!rga",
      name = "q",
      descriptor = "I"
   )
   public static int field3197;
   @OriginalMember(
      owner = "client!rga",
      name = "v",
      descriptor = "I"
   )
   public static int field3201;
   @OriginalMember(
      owner = "client!rga",
      name = "m",
      descriptor = "I"
   )
   public static int field3202;
   @OriginalMember(
      owner = "client!rga",
      name = "u",
      descriptor = "Lha;"
   )
   public static class65 field3198;

   @OriginalMember(
      owner = "client!rga",
      name = "c",
      descriptor = "(I)Lfh;"
   )
   public final class681 method1910(int arg0) {
      try {
         if (arg0 != 52) {
            field3195 = -46;
         }

         ++field3202;
         return this.field3199;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3205[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Lfh;FLfh;I)Z"
   )
   public final boolean method1911(class681 arg0, float arg1, class681 arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field3196;
         byte var6 = 1;
         class325 var7 = this.field3203.field9801;
         this.field3203.method582(class186.field2281);
         this.field3203.method593();
         this.field3203.method4861((byte)68);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glPushAttrib(2048);
         OpenGL.glViewport(0, 0, this.field3199.field10000, this.field3199.field10000);
         this.field3203.method4869(false, (byte)-72);
         this.field3203.method4911(false, -8);
         this.field3203.method4905(false, 92);
         this.field3203.method4837(false, -32);
         this.field3203.method4840(-2, 100);
         this.field3203.method4841(1, 33984);
         this.field3203.method4883(-4, arg1, 0.0F, 0.0F, 0.0F);
         this.field3203.method4862(34165, 34165, arg3 + 65572);
         this.field3203.method4848(false, arg2);
         this.field3203.method4841(0, arg3 + 99519);
         this.field3203.method4879(arg3 ^ arg3, 1);
         this.field3203.method4848(false, arg0);
         this.field3203.method4899((byte)-75, var7);
         int var8 = 0;
         int var10000;
         if (var5) {
            var10000 = var8 + 34069;
         } else if (var8 >= 6) {
            var7.method2446(0, (byte)81);
            this.field3203.method4864((byte)-48, var7);
            this.field3203.method4841(1, 33984);
            this.field3203.method4848(false, (class573)null);
            this.field3203.method4862(8448, 8448, arg3 ^ -65412);
            this.field3203.method4841(0, 33984);
            this.field3203.method4848(false, (class573)null);
            OpenGL.glPopAttrib();
            this.field3203.method577(class186.field2281[0], class186.field2281[1], class186.field2281[2], class186.field2281[3]);
            var10000 = var6;
            if (!var5) {
               if (var6 != 0 && !this.field3203.field9776) {
                  this.field3199.method4125((byte)91);
               }

               return (boolean)var6;
            }
         } else {
            var10000 = var8 + 34069;
         }

         while(true) {
            while(true) {
               int var9 = var10000;
               var7.method2452(var9, this.field3199, (byte)109, 0);
               var7.method2460(-6052, 0);
               if (var7.method2453(arg3 ^ -65469)) {
                  label155: {
                     label154: {
                        label153: {
                           label152: {
                              OpenGL.glBegin(7);
                              if (~var9 != -34070) {
                                 if (var9 == 34070) {
                                    break label152;
                                 }

                                 if (~var9 == -34072) {
                                    break label153;
                                 }

                                 if (var9 == 34072) {
                                    break label154;
                                 }

                                 if (~var9 == -34074) {
                                    OpenGL.glTexCoord3i(-65534, 65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                                    OpenGL.glVertex2f(0.0F, 0.0F);
                                    OpenGL.glTexCoord3i(65534, 65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                                    OpenGL.glVertex2f(1.0F, 0.0F);
                                    OpenGL.glTexCoord3i(65534, -65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                                    OpenGL.glVertex2f(1.0F, 1.0F);
                                    OpenGL.glTexCoord3i(-65534, -65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                                    OpenGL.glVertex2f(0.0F, 1.0F);
                                    if (var5) {
                                       OpenGL.glTexCoord3i(65534, 65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                                       OpenGL.glVertex2f(0.0F, 0.0F);
                                       OpenGL.glTexCoord3i(-65534, 65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                                       OpenGL.glVertex2f(1.0F, 0.0F);
                                       OpenGL.glTexCoord3i(-65534, -65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                                       OpenGL.glVertex2f(1.0F, 1.0F);
                                       OpenGL.glTexCoord3i(65534, -65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                                       OpenGL.glVertex2f(0.0F, 1.0F);
                                    }
                                    break label155;
                                 }

                                 if (var9 != 34074) {
                                    break label155;
                                 }

                                 if (!var5) {
                                    OpenGL.glTexCoord3i(65534, 65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                                    OpenGL.glVertex2f(0.0F, 0.0F);
                                    OpenGL.glTexCoord3i(-65534, 65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                                    OpenGL.glVertex2f(1.0F, 0.0F);
                                    OpenGL.glTexCoord3i(-65534, -65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                                    OpenGL.glVertex2f(1.0F, 1.0F);
                                    OpenGL.glTexCoord3i(65534, -65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                                    OpenGL.glVertex2f(0.0F, 1.0F);
                                    break label155;
                                 }
                              }

                              OpenGL.glTexCoord3i(65535, 65534, 65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                              OpenGL.glVertex2f(0.0F, 0.0F);
                              OpenGL.glTexCoord3i(65535, 65534, -65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                              OpenGL.glVertex2f(1.0F, 0.0F);
                              OpenGL.glTexCoord3i(65535, -65534, -65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                              OpenGL.glVertex2f(1.0F, 1.0F);
                              OpenGL.glTexCoord3i(65535, -65534, 65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                              OpenGL.glVertex2f(0.0F, 1.0F);
                              if (!var5) {
                                 break label155;
                              }
                           }

                           OpenGL.glTexCoord3i(-65535, 65534, -65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                           OpenGL.glVertex2f(0.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65535, 65534, 65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                           OpenGL.glVertex2f(1.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65535, -65534, 65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                           OpenGL.glVertex2f(1.0F, 1.0F);
                           OpenGL.glTexCoord3i(-65535, -65534, -65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                           OpenGL.glVertex2f(0.0F, 1.0F);
                           if (!var5) {
                              break label155;
                           }
                        }

                        OpenGL.glTexCoord3i(-65534, 65535, -65534);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                        OpenGL.glVertex2f(0.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65535, -65534);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                        OpenGL.glVertex2f(1.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65535, 65534);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                        OpenGL.glVertex2f(1.0F, 1.0F);
                        OpenGL.glTexCoord3i(-65534, 65535, 65534);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                        OpenGL.glVertex2f(0.0F, 1.0F);
                        if (!var5) {
                           break label155;
                        }
                     }

                     OpenGL.glTexCoord3i(-65534, -65535, 65534);
                     OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                     OpenGL.glVertex2f(0.0F, 0.0F);
                     OpenGL.glTexCoord3i(65534, -65535, 65534);
                     OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                     OpenGL.glVertex2f(1.0F, 0.0F);
                     OpenGL.glTexCoord3i(65534, -65535, -65534);
                     OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                     OpenGL.glVertex2f(1.0F, 1.0F);
                     OpenGL.glTexCoord3i(-65534, -65535, -65534);
                     OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                     OpenGL.glVertex2f(0.0F, 1.0F);
                     if (var5) {
                        OpenGL.glTexCoord3i(-65534, 65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                        OpenGL.glVertex2f(0.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                        OpenGL.glVertex2f(1.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, -65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                        OpenGL.glVertex2f(1.0F, 1.0F);
                        OpenGL.glTexCoord3i(-65534, -65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                        OpenGL.glVertex2f(0.0F, 1.0F);
                        if (var5) {
                           OpenGL.glTexCoord3i(65534, 65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                           OpenGL.glVertex2f(0.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65534, 65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                           OpenGL.glVertex2f(1.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65534, -65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                           OpenGL.glVertex2f(1.0F, 1.0F);
                           OpenGL.glTexCoord3i(65534, -65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                           OpenGL.glVertex2f(0.0F, 1.0F);
                        }
                     }
                  }

                  OpenGL.glEnd();
                  if (var5) {
                     var6 = 0;
                     var7.method2446(0, (byte)81);
                     this.field3203.method4864((byte)-48, var7);
                     this.field3203.method4841(1, 33984);
                     this.field3203.method4848(false, (class573)null);
                     this.field3203.method4862(8448, 8448, arg3 ^ -65412);
                     this.field3203.method4841(0, 33984);
                     this.field3203.method4848(false, (class573)null);
                     OpenGL.glPopAttrib();
                     this.field3203.method577(class186.field2281[0], class186.field2281[1], class186.field2281[2], class186.field2281[3]);
                     var10000 = var6;
                     if (!var5) {
                        if (var6 != 0 && !this.field3203.field9776) {
                           this.field3199.method4125((byte)91);
                        }

                        return (boolean)var6;
                     }
                  } else {
                     ++var8;
                     if (var8 >= 6) {
                        var7.method2446(0, (byte)81);
                        this.field3203.method4864((byte)-48, var7);
                        this.field3203.method4841(1, 33984);
                        this.field3203.method4848(false, (class573)null);
                        this.field3203.method4862(8448, 8448, arg3 ^ -65412);
                        this.field3203.method4841(0, 33984);
                        this.field3203.method4848(false, (class573)null);
                        OpenGL.glPopAttrib();
                        this.field3203.method577(class186.field2281[0], class186.field2281[1], class186.field2281[2], class186.field2281[3]);
                        var10000 = var6;
                        if (!var5) {
                           if (var6 != 0 && !this.field3203.field9776) {
                              this.field3199.method4125((byte)91);
                           }

                           return (boolean)var6;
                        }
                     } else {
                        var10000 = var8 + 34069;
                     }
                  }
               } else {
                  var6 = 0;
                  var7.method2446(0, (byte)81);
                  this.field3203.method4864((byte)-48, var7);
                  this.field3203.method4841(1, 33984);
                  this.field3203.method4848(false, (class573)null);
                  this.field3203.method4862(8448, 8448, arg3 ^ -65412);
                  this.field3203.method4841(0, 33984);
                  this.field3203.method4848(false, (class573)null);
                  OpenGL.glPopAttrib();
                  this.field3203.method577(class186.field2281[0], class186.field2281[1], class186.field2281[2], class186.field2281[3]);
                  var10000 = var6;
                  if (!var5) {
                     if (var6 != 0 && !this.field3203.field9776) {
                        this.field3199.method4125((byte)91);
                     }

                     return (boolean)var6;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field3205[2] + (arg0 != null ? field3205[0] : field3205[1]) + ',' + arg1 + ',' + (arg2 != null ? field3205[0] : field3205[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1912(int arg0, int arg1) {
      try {
         if (arg0 >= 91) {
            ++field3192;
            class595.field8288 = 3;
            class701.field10210 = -1;
            class367.field5175 = arg1;
            class730.field10685 = 100;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3205[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1913(int arg0) {
      try {
         field3198 = null;
         if (arg0 != -6447) {
            field3200 = 107;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3205[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method1914(int arg0) {
      try {
         ++field3197;
         class554 var1 = (class554)class746.field10840.method3855(-91);
         if (arg0 != 0) {
            field3195 = 79;
         }

         boolean var2 = class602.field8398 != null || class450.field6220 > 0;
         int var3 = var1.method3705(true);
         int var4 = var1.method3707((byte)-106);
         if (var2) {
            class417.field5859 = 1;
         }

         if (!var2) {
            class310.method2323(var4, var3, -2, class717.field10512);
         } else {
            class484.field6673 = class717.field10512;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3205[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1915(int arg0) {
      try {
         ++field3193;
         if (arg0 > -41) {
            this.field3203 = null;
         }

         return this.field3199.field10000;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3205[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "<init>",
      descriptor = "(Lor;I)V"
   )
   public class252(class670 arg0, int arg1) {
      try {
         this.field3203 = arg0;
         this.field3199 = new class681(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3205[4] + (arg0 != null ? field3205[0] : field3205[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1916(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1917(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
