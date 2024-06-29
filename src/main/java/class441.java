import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class441 extends class55 {
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6284 = new String[]{method3250(method3249("cKP(W")), method3250(method3249("v\u0010\u0012j")), method3250(method3249("K\r\u001fbOjE\u0012oDs\f\u0010a\n~\u0004\u0017jO|_")), method3250(method3249("m\u0012PG\u0002")), method3250(method3249("m\u0012PE\u0002")), method3250(method3249("m\u0012PB\u0002")), method3250(method3249("m\u0012PN\u0002")), method3250(method3249("m\u0012PC\u0002")), method3250(method3249("m\u0012PA\u0002")), method3250(method3249("m\u0012P@\u0002")), method3250(method3249("m\u0012PD\u0002"))};
   @OriginalMember(
      owner = "client!uw",
      name = "n",
      descriptor = "Leg;"
   )
   public static class118 field6278 = new class118(136, -1);
   @OriginalMember(
      owner = "client!uw",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field6281 = new class118(89, -2);
   @OriginalMember(
      owner = "client!uw",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field6282 = false;
   @OriginalMember(
      owner = "client!uw",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field6283 = new int[2];
   @OriginalMember(
      owner = "client!uw",
      name = "h",
      descriptor = "I"
   )
   public static int field6273;
   @OriginalMember(
      owner = "client!uw",
      name = "f",
      descriptor = "I"
   )
   public static int field6274;
   @OriginalMember(
      owner = "client!uw",
      name = "k",
      descriptor = "I"
   )
   public static int field6275;
   @OriginalMember(
      owner = "client!uw",
      name = "g",
      descriptor = "I"
   )
   public static int field6276;
   @OriginalMember(
      owner = "client!uw",
      name = "j",
      descriptor = "I"
   )
   public static int field6277;
   @OriginalMember(
      owner = "client!uw",
      name = "i",
      descriptor = "I"
   )
   public static int field6279;
   @OriginalMember(
      owner = "client!uw",
      name = "l",
      descriptor = "I"
   )
   public static int field6280;

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field6277;
         if (arg0 >= -116) {
            this.method101(-126);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6284[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         super.field680 = arg0;
         ++field6280;
         int var3 = 89 % ((arg1 - 47) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6284[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3245(int arg0) {
      try {
         int var2 = 12 % ((arg0 - 36) / 41);
         ++field6279;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6284[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field6276;
         if (arg0 != 0) {
            field6283 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6284[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class441(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uw",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method3246(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 == 0) {
            ++field6274;
            class679 var2 = null;

            try {
               class296 var3 = class316.field4304.method4508((byte)113, "", true);
               if (var1) {
                  class661.method4825(arg0, 1L);
               }

               while(true) {
                  int var10000;
                  if (~var3.field4078 != -1) {
                     var10000 = var3.field4078;
                     if (!var1) {
                        if (var10000 == 1) {
                           var2 = (class679)var3.field4077;
                           class147 var4 = class300.field4107.method3303(28116);
                           var2.method4958(0, var4.field1856, var4.field1889, 1);
                        }
                        break;
                     }
                  } else {
                     var10000 = arg0;
                  }

                  class661.method4825(var10000, 1L);
               }
            } catch (Exception var7) {
            }

            try {
               if (var2 != null) {
                  var2.method4960(true);
               }
            } catch (Exception var6) {
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6284[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field6273;
         if (arg1 != 105) {
            field6282 = false;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6284[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class441(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I[Llha;Lwi;)Lls;"
   )
   public static final class151 method3247(int arg0, class653[] arg1, class494 arg2) {
      boolean var3 = client.field4360;

      try {
         ++field6275;
         int var4 = 0;
         if (var3) {
            if (arg1[var4] == null || arg1[var4].field9561 <= 0L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (~var4 <= ~arg1.length) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg1[var7].field9561);
                  ++var7;
               }

               while(true) {
                  while(~arg1.length < ~var7) {
                     OpenGL.glAttachObjectARB(var5, arg1[var7].field9561);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class464.field6670, arg0);
                  if (!var3) {
                     if (class464.field6670[0] == 0) {
                        if (class464.field6670[0] == 0) {
                           System.out.println(field6284[2]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class464.field6670, 1);
                        if (class464.field6670[1] > 1) {
                           byte[] var8 = new byte[class464.field6670[1]];
                           OpenGL.glGetInfoLogARB(var5, class464.field6670[1], class464.field6670, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class464.field6670[0] == -1) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg1[var9].field9561);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg1.length) {
                                 OpenGL.glDetachObjectARB(var5, arg1[var9].field9561);
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

                     return new class151(arg2, var5, arg1);
                  }

                  ++var7;
               }
            }

            if (arg1[var4] == null || arg1[var4].field9561 <= 0L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field6284[3] + arg0 + ',' + (arg1 != null ? field6284[0] : field6284[1]) + ',' + (arg2 != null ? field6284[0] : field6284[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3248(byte arg0) {
      try {
         field6281 = null;
         field6278 = null;
         if (arg0 != 8) {
            field6283 = null;
         }

         field6283 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6284[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3249(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3250(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
