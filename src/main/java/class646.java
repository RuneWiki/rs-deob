import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class646 extends class550 {
   @OriginalMember(
      owner = "client!iu",
      name = "l",
      descriptor = "Lcka;"
   )
   private class174 field9326;
   @OriginalMember(
      owner = "client!iu",
      name = "s",
      descriptor = "Lsc;"
   )
   private class97 field9319;
   @OriginalMember(
      owner = "client!iu",
      name = "j",
      descriptor = "Lcca;"
   )
   private class129 field9317;
   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9327 = new String[]{method4698(method4697("OL}\u0002\b")), method4698(method4697("OL}\u0001\b")), method4698(method4697("]\u0017}m]")), method4698(method4697("RK2-SVX!&NRf$\"TCK")), method4698(method4697("AU")), method4698(method4697("OL}\u007fIHP'}\b")), method4698(method4697("HL?/")), method4698(method4697("\u001aZ</\u001d@_5%F@\u0007sl\u0000")), method4698(method4697("OL}\u000f\b")), method4698(method4697("\u0006\u0014m")), method4698(method4697("OL}\u0000\b")), method4698(method4697("OL}\n\b")), method4698(method4697("OL}\u0006\b")), method4698(method4697("OL}\u0005\b"))};
   @OriginalMember(
      owner = "client!iu",
      name = "r",
      descriptor = "I"
   )
   public static int field9318;
   @OriginalMember(
      owner = "client!iu",
      name = "n",
      descriptor = "I"
   )
   public static int field9320;
   @OriginalMember(
      owner = "client!iu",
      name = "o",
      descriptor = "I"
   )
   public static int field9321;
   @OriginalMember(
      owner = "client!iu",
      name = "k",
      descriptor = "I"
   )
   public static int field9322;
   @OriginalMember(
      owner = "client!iu",
      name = "q",
      descriptor = "I"
   )
   public static int field9323;
   @OriginalMember(
      owner = "client!iu",
      name = "m",
      descriptor = "I"
   )
   public static int field9324;
   @OriginalMember(
      owner = "client!iu",
      name = "p",
      descriptor = "I"
   )
   public static int field9325;

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public final void method72(int arg0) {
      try {
         ++field9321;
         super.field8234.method2185((byte)-127, 0, class751.field11122);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         if (arg0 == -2) {
            OpenGL.glDisable(34336);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9327[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ZB)V",
      line = 24
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         if (arg1 > -44) {
            this.field9319 = null;
         }

         ++field9320;
         OpenGL.glBindProgramARB(34336, this.field9317.field1847);
         OpenGL.glEnable(34336);
         super.field8234.method2185((byte)-116, 0, class36.field435);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9327[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 38
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         ++field9323;
         int var4 = 101 / ((arg1 - 18) / 60);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9327[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9327[2] : field9327[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lha;I)V",
      line = 47
   )
   public static final void method4696(class610 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field9318;
         if ((class558.field8307 >= 2 || class552.field8264) && class358.field5551 == null) {
            if (arg1 <= 26) {
               method4696((class610)null, 47);
            }

            String var3;
            label128: {
               if (class552.field8264 && ~class558.field8307 > -3) {
                  var3 = class443.field6803 + class499.field7620.method3875(class493.field7455, 127) + class65.field860 + field9327[9];
                  if (!var2) {
                     break label128;
                  }
               }

               if (!class127.field1823 || !class300.field4707.method219(81, (byte)-100) || class558.field8307 <= 2) {
                  class185 var4 = class305.field4780;
                  if (var4 == null) {
                     return;
                  }

                  var3 = class111.method1050(-11382, var4);
                  int[] var5 = null;
                  if (class656.method4832(var4.field2896, (byte)127)) {
                     var5 = class247.field3763.method2058(-11, (int)var4.field2907).field1931;
                  } else if (~var4.field2905 == 0) {
                     if (!class115.method1069(var4.field2896, (byte)116)) {
                        if (class225.method1953(-128, var4.field2896)) {
                           class333 var6 = class102.field1434.method1411((int)(var4.field2907 >>> 32 & 2147483647L), -97);
                           if (var6.field5088 != null) {
                              var6 = var6.method2714(class45.field599, -1);
                           }

                           if (var6 != null) {
                              var5 = var6.field5057;
                           }
                        }
                     } else {
                        class795 var7 = (class795)class501.field7665.method3141((long)((int)var4.field2907), true);
                        if (var7 != null) {
                           class466 var8 = var7.field11592;
                           class344 var9 = var8.field7072;
                           if (var9.field5221 != null) {
                              var9 = var9.method2782((byte)-117, class45.field599);
                           }

                           if (var9 != null) {
                              var5 = var9.field5234;
                           }
                        }
                     }
                  } else {
                     var5 = class247.field3763.method2058(-11, var4.field2905).field1931;
                  }

                  if (var5 == null) {
                     break label128;
                  }

                  var3 = var3 + class202.method1765(var5, 108);
                  if (!var2) {
                     break label128;
                  }
               }

               var3 = class111.method1050(-11382, class305.field4780);
            }

            if (~class558.field8307 < -3) {
               var3 = var3 + field9327[7] + (class558.field8307 + -2) + class499.field7613.method3875(class493.field7455, 97);
            }

            if (class509.field7792 != null) {
               class288 var10 = class509.field7792.method3056(arg0, (byte)-103);
               if (var10 == null) {
                  var10 = class156.field2324;
               }

               var10.method2415(class509.field7792.field5849, class238.field3621, class82.field1183, class537.field8119, class355.field5470, class57.field706, class509.field7792.field5938, (byte)-120, class509.field7792.field5835, var3, class509.field7792.field5839, class509.field7792.field5915, class509.field7792.field5955, class332.field5030, class610.field8880);
               class793.method5733(class57.field706[0], class57.field706[3], (byte)45, class57.field706[2], class57.field706[1]);
            } else if (class723.field10824 != null && class619.field9004 == class410.field6382) {
               int var11 = class156.field2324.method2418(class501.field7667 + 16, var3, class537.field8119, 0, 16777215, true, class610.field8880, class238.field3621, class493.field7449 + 4, class82.field1183);
               class793.method5733(class493.field7449 + 4, 16, (byte)45, class355.field5457.method5130(true, var3) - -var11, class501.field7667);
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field9327[8] + (arg0 != null ? field9327[2] : field9327[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(B)Z",
      line = 148
   )
   public final boolean method69(byte arg0) {
      try {
         if (arg0 != 120) {
            this.field9326 = null;
         }

         ++field9322;
         return this.field9317 != null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9327[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BZ)V",
      line = 161
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         super.field8234.method2212((byte)119, class453.field6943, class154.field2302);
         if (arg0 > 82) {
            ++field9324;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9327[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BII)V",
      line = 173
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         label19: {
            if (!this.field9319.field1361) {
               int var4 = super.field8234.field4155 % 4000 * 16 / 4000;
               super.field8234.method2193(this.field9319.field1363[var4], (byte)-19);
               OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
               if (!client.field1786) {
                  break label19;
               }
            }

            float var5 = (float)(super.field8234.field4155 % 4000) / 4000.0F;
            super.field8234.method2193(this.field9319.field1367, (byte)-19);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
         }

         ++field9325;
         if (arg0 != 90) {
            this.field9326 = null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9327[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "<init>",
      descriptor = "(Lcka;Lrr;Lsc;)V",
      line = 198
   )
   public class646(class174 arg0, class678 arg1, class97 arg2) {
      super(arg0);

      try {
         this.field9326 = arg0;
         this.field9319 = arg2;
         if (arg1 != null && this.field9319.method955((byte)-104) && this.field9326.field2728) {
            this.field9317 = class5.method21(this.field9326, 48, 34336, arg1.method5023(field9327[3], field9327[4], 0));
         } else {
            this.field9317 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9327[5] + (arg0 != null ? field9327[2] : field9327[6]) + ',' + (arg1 != null ? field9327[2] : field9327[6]) + ',' + (arg2 != null ? field9327[2] : field9327[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4697(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4698(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
