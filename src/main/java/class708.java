import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public abstract class class708 implements class515 {
   @OriginalMember(
      owner = "client!wca",
      name = "h",
      descriptor = "I"
   )
   private int field10270 = 0;
   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "I"
   )
   private int field10275 = -1;
   @OriginalMember(
      owner = "client!wca",
      name = "g",
      descriptor = "Lkfa;"
   )
   public class632 field10281;
   @OriginalMember(
      owner = "client!wca",
      name = "u",
      descriptor = "Z"
   )
   private boolean field10280;
   @OriginalMember(
      owner = "client!wca",
      name = "s",
      descriptor = "I"
   )
   private int field10279;
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10289 = new String[]{method5158(method5157("8+fL:g")), method5158(method5157("8+fL5g")), method5158(method5157("8+fL*g")), method5158(method5157("8+fL>g")), method5158(method5157("8+fL4g")), method5158(method5157("4f)L\u0006")), method5158(method5157("!=k\u000e")), method5158(method5157("8+fL+g")), method5158(method5157("8+fL7g")), method5158(method5157("8+fL<g")), method5158(method5157("8+fL6g")), method5158(method5157("\u000e\u001a@*Z")), method5158(method5157("8+fL\u001d&&f\u000e\u00125-/")), method5158(method5157("8+fLG&&n\u0016Eg")), method5158(method5157("8+fL0g")), method5158(method5157("8+fL(g")), method5158(method5157("8+fL)g"))};
   @OriginalMember(
      owner = "client!wca",
      name = "t",
      descriptor = "I"
   )
   public static int field10284 = -1;
   @OriginalMember(
      owner = "client!wca",
      name = "v",
      descriptor = "[Lts;"
   )
   public static class565[] field10278 = new class565[8];
   @OriginalMember(
      owner = "client!wca",
      name = "r",
      descriptor = "I"
   )
   public static int field10266;
   @OriginalMember(
      owner = "client!wca",
      name = "f",
      descriptor = "I"
   )
   public static int field10267;
   @OriginalMember(
      owner = "client!wca",
      name = "e",
      descriptor = "I"
   )
   public static int field10269;
   @OriginalMember(
      owner = "client!wca",
      name = "k",
      descriptor = "I"
   )
   public static int field10271;
   @OriginalMember(
      owner = "client!wca",
      name = "l",
      descriptor = "I"
   )
   public static int field10272;
   @OriginalMember(
      owner = "client!wca",
      name = "w",
      descriptor = "I"
   )
   private int field10273;
   @OriginalMember(
      owner = "client!wca",
      name = "j",
      descriptor = "I"
   )
   private int field10274;
   @OriginalMember(
      owner = "client!wca",
      name = "i",
      descriptor = "I"
   )
   public static int field10276;
   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "I"
   )
   public static int field10277;
   @OriginalMember(
      owner = "client!wca",
      name = "n",
      descriptor = "I"
   )
   public static int field10282;
   @OriginalMember(
      owner = "client!wca",
      name = "m",
      descriptor = "I"
   )
   public static int field10283;
   @OriginalMember(
      owner = "client!wca",
      name = "q",
      descriptor = "I"
   )
   public static int field10285;
   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "I"
   )
   public static int field10286;
   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "I"
   )
   public static int field10287;
   @OriginalMember(
      owner = "client!wca",
      name = "p",
      descriptor = "I"
   )
   public static int field10288;
   @OriginalMember(
      owner = "client!wca",
      name = "o",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field10268;

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(BI)V"
   )
   public void method895(byte arg0, int arg1) {
      try {
         if (arg1 > this.field10273) {
            label35: {
               this.method5148(5);
               if (this.field10275 <= 0) {
                  this.field10268 = this.field10281.method2553(1, false, arg1);
                  if (!client.field4273) {
                     break label35;
                  }
               }

               OpenGL.glBindBufferARB(this.field10279, this.field10275);
               OpenGL.glBufferDataARBub(this.field10279, arg1, (byte[])null, 0, !this.field10280 ? 35044 : 35040);
               this.field10281.field4554 += arg1 - this.field10273;
            }

            this.field10273 = arg1;
         }

         ++field10266;
         if (arg0 > 91) {
            this.field10274 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10289[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method5148(int arg0) {
      try {
         if (arg0 == 5) {
            ++field10283;
            if (this.field10275 < 0) {
               if (this.field10281.field8944) {
                  OpenGL.glGenBuffersARB(1, class233.field2886, 0);
                  this.field10275 = class233.field2886[0];
                  OpenGL.glBindBufferARB(this.field10279, this.field10275);
               } else {
                  this.field10275 = 0;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10289[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method5149(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         label140: {
            ++field10272;
            if (class618.field8619 < class618.field8618) {
               class618.field8619 = (float)((double)class618.field8619 / 30.0D + (double)class618.field8619);
               if (class618.field8618 < class618.field8619) {
                  class618.field8619 = class618.field8618;
               }

               class245.method1842(107);
               class618.field8620 = (int)class618.field8619 >> 1;
               class618.field8622 = class701.method5087(112, class618.field8620);
               if (!var3) {
                  break label140;
               }
            }

            if (class618.field8618 < class618.field8619) {
               class618.field8619 = (float)((double)class618.field8619 - (double)class618.field8619 / 30.0D);
               if (class618.field8618 > class618.field8619) {
                  class618.field8619 = class618.field8618;
               }

               class245.method1842(82);
               class618.field8620 = (int)class618.field8619 >> 1;
               class618.field8622 = class701.method5087(79, class618.field8620);
            }
         }

         if (~class226.field2841 != 0 && ~class575.field7911 != 0) {
            int var4 = -class791.field11574 + class226.field2841;
            if (~var4 > -3 || var4 > 2) {
               var4 /= 8;
            }

            int var5 = -class231.field2870 + class575.field7911;
            class791.field11574 += var4;
            if (var5 < 2 || ~var5 < -3) {
               var5 /= 8;
            }

            class231.field2870 += var5;
            if (~var4 == -1 && ~var5 == -1) {
               class226.field2841 = -1;
               class575.field7911 = -1;
            }

            class245.method1842(80);
         }

         label121: {
            if (~class595.field8288 < -1) {
               --class730.field10685;
               if (~class730.field10685 != -1) {
                  break label121;
               }

               --class595.field8288;
               class730.field10685 = 100;
               if (!var3) {
                  break label121;
               }
            }

            class367.field5175 = -1;
            class701.field10210 = -1;
         }

         if (class626.field8755 && class572.field7867 != null) {
            class623 var6 = (class623)class572.field7867.method3855(-11);
            if (var3 || var6 != null) {
               do {
                  label109: {
                     class297 var7 = class618.field8609.method5236(var6.field8706.field2123, (byte)70);
                     if (var6.method4530(arg2, (byte)119, arg1)) {
                        if (var7.field3938 != null) {
                           if (var7.field3938[4] != null) {
                              class324.method2441((long)var6.field8706.field2123, false, 126, (long)var6.field8706.field2123, var7.field3915, var7.field3902, var7.field3938[4], -1, 0, true, 1001, false, -1);
                           }

                           if (var7.field3938[3] != null) {
                              class324.method2441((long)var6.field8706.field2123, false, 125, (long)var6.field8706.field2123, var7.field3915, var7.field3902, var7.field3938[3], -1, 0, true, 1009, false, -1);
                           }

                           if (var7.field3938[2] != null) {
                              class324.method2441((long)var6.field8706.field2123, false, 121, (long)var6.field8706.field2123, var7.field3915, var7.field3902, var7.field3938[2], -1, 0, true, 1004, false, -1);
                           }

                           if (var7.field3938[1] != null) {
                              class324.method2441((long)var6.field8706.field2123, false, 124, (long)var6.field8706.field2123, var7.field3915, var7.field3902, var7.field3938[1], -1, 0, true, 1010, false, -1);
                           }

                           if (var7.field3938[0] != null) {
                              class324.method2441((long)var6.field8706.field2123, false, 121, (long)var6.field8706.field2123, var7.field3915, var7.field3902, var7.field3938[0], -1, 0, true, 1012, false, -1);
                           }
                        }

                        if (!var6.field8706.field2119) {
                           var6.field8706.field2119 = true;
                           class16.method126(class378.field5298, var6.field8706.field2123, var7.field3902);
                        }

                        if (!var6.field8706.field2119) {
                           break label109;
                        }

                        class16.method126(class185.field2270, var6.field8706.field2123, var7.field3902);
                        if (!var3) {
                           break label109;
                        }
                     }

                     if (var6.field8706.field2119) {
                        var6.field8706.field2119 = false;
                        class16.method126(class511.field7074, var6.field8706.field2123, var7.field3902);
                     }
                  }

                  var6 = (class623)class572.field7867.method3866((byte)112);
               } while(var6 != null);
            }
         }

         if (!arg0) {
            method5152(39);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10289[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(B)V"
   )
   public void method788(byte arg0) {
      try {
         ++field10271;
         if (this.field10275 > 0) {
            this.field10281.method4592(this.field10274, this.field10275, (byte)-14);
            this.field10275 = -1;
         }

         if (arg0 < 21) {
            field10287 = 15;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10289[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method5150(byte arg0) {
      try {
         ++field10286;
         if (arg0 != -39) {
            this.method788((byte)102);
         }

         return this.field10275 != 0 ? 0L : this.field10268.getAddress();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10289[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5151(int arg0) {
      try {
         if (arg0 > -19) {
            method5149(false, -85, 6);
         }

         field10278 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10289[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "(I)I"
   )
   public static final int method5152(int arg0) {
      try {
         ++field10269;
         if (class666.field9473) {
            return 6;
         } else if (class717.field10512 == null) {
            return 0;
         } else {
            int var1 = class717.field10512.field2993;
            if (class577.method4149(true, var1)) {
               return 1;
            } else if (class374.method2898(-84, var1)) {
               return 2;
            } else if (class242.method1814(-38, var1)) {
               return 3;
            } else if (class550.method3974((byte)-126, var1)) {
               return 4;
            } else {
               if (arg0 > -41) {
                  method5152(-83);
               }

               return 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10289[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;"
   )
   public final Buffer method5153(int arg0, MapBuffer arg1, boolean arg2) {
      try {
         ++field10282;
         if (~this.field10270 == -1) {
            this.method5148(5);
            if (~this.field10275 >= -1) {
               this.field10270 = 2;
               return this.field10268;
            }

            OpenGL.glBindBufferARB(this.field10279, this.field10275);
            if (arg2) {
               OpenGL.glBufferDataARBub(this.field10279, this.field10273, (byte[])null, 0, this.field10280 ? 35040 : 35044);
               if (~this.field10274 >= ~this.field10281.field4433.field10220) {
                  this.field10270 = 1;
                  return this.field10281.field4433;
               }
            }

            if (!arg1.method4753() && arg1.method4754(this.field10279, this.field10274, 35001)) {
               this.field10270 = 2;
               return arg1;
            }
         }

         int var4 = -14 / ((arg0 - 22) / 41);
         return null;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10289[7] + arg0 + ',' + (arg1 != null ? field10289[5] : field10289[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(ILjaggl/MapBuffer;)Z"
   )
   public final boolean method5154(int arg0, MapBuffer arg1) {
      try {
         ++field10277;
         boolean var3 = true;
         if (this.field10270 != arg0) {
            if (this.field10275 > 0) {
               label35: {
                  OpenGL.glBindBufferARB(this.field10279, this.field10275);
                  if (this.field10270 == 1) {
                     OpenGL.glBufferSubDataARBa(this.field10279, 0, this.field10273, this.field10281.field4433.getAddress());
                     if (!client.field4273) {
                        break label35;
                     }
                  }

                  var3 = arg1.method4752();
               }
            }

            this.field10270 = 0;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10289[16] + arg0 + ',' + (arg1 != null ? field10289[5] : field10289[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field10285;
         this.method788((byte)47);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10289[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5155(boolean arg0) {
      try {
         if (arg0) {
            if (this.field10281.field8944) {
               OpenGL.glBindBufferARB(this.field10279, this.field10275);
            }

            ++field10276;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10289[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(IILjaclib/memory/Source;)Z"
   )
   public final boolean method5156(int arg0, int arg1, Source arg2) {
      try {
         ++field10288;
         if (arg0 != 0) {
            field10278 = null;
         }

         label44: {
            if (arg1 <= this.field10273) {
               if (~this.field10275 >= -1) {
                  throw new RuntimeException(field10289[11]);
               }

               OpenGL.glBindBufferARB(this.field10279, this.field10275);
               OpenGL.glBufferSubDataARBa(this.field10279, 0, this.field10274, arg2.getAddress());
               this.field10281.field4554 += -this.field10274 + arg1;
               if (!client.field4273) {
                  break label44;
               }
            }

            this.method5148(arg0 ^ 5);
            if (this.field10275 <= 0) {
               throw new RuntimeException(field10289[11]);
            }

            OpenGL.glBindBufferARB(this.field10279, this.field10275);
            OpenGL.glBufferDataARBa(this.field10279, arg1, arg2.getAddress(), this.field10280 ? 35040 : 35044);
            this.field10281.field4554 += -this.field10274 + arg1;
            this.field10273 = arg1;
         }

         this.field10274 = arg1;
         return true;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10289[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10289[5] : field10289[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(I)I"
   )
   public int method794(int arg0) {
      try {
         ++field10267;
         if (arg0 != 1143968105) {
            this.method788((byte)-36);
         }

         return this.field10274;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10289[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "<init>",
      descriptor = "(Lkfa;IZ)V"
   )
   public class708(class632 arg0, int arg1, boolean arg2) {
      try {
         this.field10281 = arg0;
         this.field10280 = arg2;
         this.field10279 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10289[13] + (arg0 != null ? field10289[5] : field10289[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
