import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class686 {
   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9906 = new String[]{method4996(method4995("\u0004Ujr\u0014E")), method4996(method4995("\u0004Ujq\u0014E")), method4996(method4995("\u0003G([")), method4996(method4995("\u0016\u001cj\u0019+")), method4996(method4995("\u0004Uj\u007f\u0014E")), method4996(method4995(">Z%S3\u001f\u0012(^8\u0006[*Pv\u000bS-[3\t\b")), method4996(method4995("\u0004Ujs\u0014E")), method4996(method4995("\u0004Ujp\u0014E"))};
   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9898 = new String[100];
   @OriginalMember(
      owner = "client!ig",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field9902 = false;
   @OriginalMember(
      owner = "client!ig",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field9904 = false;
   @OriginalMember(
      owner = "client!ig",
      name = "f",
      descriptor = "Lfm;"
   )
   public static class164 field9901 = new class164(82, -1);
   @OriginalMember(
      owner = "client!ig",
      name = "e",
      descriptor = "I"
   )
   public static int field9895;
   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "I"
   )
   public static int field9896;
   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "I"
   )
   public static int field9897;
   @OriginalMember(
      owner = "client!ig",
      name = "d",
      descriptor = "I"
   )
   public static int field9900;
   @OriginalMember(
      owner = "client!ig",
      name = "i",
      descriptor = "Lgga;"
   )
   public static class502 field9905;
   @OriginalMember(
      owner = "client!ig",
      name = "k",
      descriptor = "Lig;"
   )
   public class686 field9899;
   @OriginalMember(
      owner = "client!ig",
      name = "h",
      descriptor = "Lig;"
   )
   public class686 field9903;

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(JII)Ljava/lang/String;"
   )
   public static final String method4990(long arg0, int arg1, int arg2) {
      try {
         class623.method4590(false, arg0);
         ++field9895;
         int var4 = class309.field4659.get(5);
         if (arg1 != 0) {
            return null;
         } else {
            int var5 = class309.field4659.get(2) + 1;
            int var6 = class309.field4659.get(1);
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9906[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(ZLaea;[Lbfa;)Lpk;"
   )
   public static final class627 method4991(boolean arg0, class678 arg1, class631[] arg2) {
      boolean var3 = client.field10022;

      try {
         ++field9900;
         int var4 = 0;
         if (var3) {
            if (arg2[var4] == null || ~arg2[var4].field8966 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (~var4 <= ~arg2.length) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg2[var7].field8966);
                  ++var7;
               }

               while(true) {
                  while(~var7 > ~arg2.length) {
                     OpenGL.glAttachObjectARB(var5, arg2[var7].field8966);
                     ++var7;
                  }

                  if (!var3) {
                     if (!arg0) {
                        method4992((byte)-94);
                     }

                     OpenGL.glLinkProgramARB(var5);
                     OpenGL.glGetObjectParameterivARB(var5, 35714, class642.field9032, 0);
                     if (~class642.field9032[0] == -1) {
                        if (class642.field9032[0] == 0) {
                           System.out.println(field9906[5]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class642.field9032, 1);
                        if (class642.field9032[1] > 1) {
                           byte[] var8 = new byte[class642.field9032[1]];
                           OpenGL.glGetInfoLogARB(var5, class642.field9032[1], class642.field9032, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class642.field9032[0] == -1) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg2[var9].field8966);
                              ++var9;
                           }

                           while(true) {
                              while(~var9 > ~arg2.length) {
                                 OpenGL.glDetachObjectARB(var5, arg2[var9].field8966);
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

                     return new class627(arg1, var5, arg2);
                  }

                  ++var7;
               }
            }

            if (arg2[var4] == null || ~arg2[var4].field8966 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field9906[4] + arg0 + ',' + (arg1 != null ? field9906[3] : field9906[2]) + ',' + (arg2 != null ? field9906[3] : field9906[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4992(byte arg0) {
      try {
         field9905 = null;
         if (arg0 != -1) {
            method4991(true, (class678)null, (class631[])null);
         }

         field9898 = null;
         field9901 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9906[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(ZI)[[[B"
   )
   public static final byte[][][] method4993(boolean param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method4994(byte arg0) {
      try {
         ++field9896;
         if (this.field9899 != null) {
            this.field9899.field9903 = this.field9903;
            if (arg0 >= -97) {
               this.method4994((byte)54);
            }

            this.field9903.field9899 = this.field9899;
            this.field9903 = null;
            this.field9899 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9906[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4995(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4996(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
