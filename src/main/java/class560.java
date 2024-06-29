import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class560 extends class791 {
   @OriginalMember(
      owner = "client!pt",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7683 = new String[]{method4035(method4034("\"W\u001cyp\u0003\u001f\u0011t{\u001aV\u0013z5\u0017^\u0014qp\u0015\u0005")), method4035(method4034("\n\u0011S3h")), method4035(method4034("\u001fJ\u0011q")), method4035(method4034("\u0001KS[=")), method4035(method4034("\u0001KSU=")), method4035(method4034("\u0001KSX=")), method4035(method4034("\u0001KSY=")), method4035(method4034("\u0001KS^="))};
   @OriginalMember(
      owner = "client!pt",
      name = "E",
      descriptor = "I"
   )
   public static int field7678;
   @OriginalMember(
      owner = "client!pt",
      name = "I",
      descriptor = "I"
   )
   public static int field7679;
   @OriginalMember(
      owner = "client!pt",
      name = "J",
      descriptor = "I"
   )
   public static int field7681;
   @OriginalMember(
      owner = "client!pt",
      name = "H",
      descriptor = "I"
   )
   public static int field7682;
   @OriginalMember(
      owner = "client!pt",
      name = "D",
      descriptor = "Lbo;"
   )
   public static class763 field7677;
   @OriginalMember(
      owner = "client!pt",
      name = "G",
      descriptor = "[B"
   )
   private byte[] field7680;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(ILkfa;[Lqfa;)Lqr;"
   )
   public static final class71 method4030(int arg0, class632 arg1, class107[] arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7681;
         int var4 = 0;
         if (var3) {
            if (arg2[var4] == null || ~arg2[var4].field1371 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (~var4 <= ~arg2.length) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = arg0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg2[arg0].field1371);
                  var7 = arg0 + 1;
               }

               while(true) {
                  while(arg2.length > var7) {
                     OpenGL.glAttachObjectARB(var5, arg2[var7].field1371);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class589.field8115, 0);
                  if (!var3) {
                     if (class589.field8115[0] == 0) {
                        if (class589.field8115[0] == 0) {
                           System.out.println(field7683[0]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class589.field8115, 1);
                        if (~class589.field8115[1] < -2) {
                           byte[] var8 = new byte[class589.field8115[1]];
                           OpenGL.glGetInfoLogARB(var5, class589.field8115[1], class589.field8115, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class589.field8115[0] == -1) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg2[var9].field1371);
                              ++var9;
                           }

                           while(true) {
                              while(~var9 > ~arg2.length) {
                                 OpenGL.glDetachObjectARB(var5, arg2[var9].field1371);
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

                     return new class71(arg1, var5, arg2);
                  }

                  ++var7;
               }
            }

            if (arg2[var4] == null || ~arg2[var4].field1371 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7683[3] + arg0 + ',' + (arg1 != null ? field7683[1] : field7683[2]) + ',' + (arg2 != null ? field7683[1] : field7683[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method117(int arg0, int arg1, byte arg2) {
      try {
         ++field7678;
         byte var7 = (byte)((127 & arg2 >> 1) + 127);
         int var4 = arg1 * 2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field7680[var10001] = var7;
         this.field7680[var8] = var7;
         if (arg0 != -513) {
            this.method117(68, -95, (byte)-87);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7683[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IBII)[B"
   )
   public final byte[] method4031(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field7679;
         this.field7680 = new byte[arg0 * arg3 * arg2 * 2];
         int var5 = 19 / ((-3 - arg1) / 52);
         this.method1350(arg3, arg0, arg2, (byte)-10);
         return this.field7680;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7683[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(Lui;I)V"
   )
   public static final void method4032(class241 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pt",
      name = "<init>",
      descriptor = "()V"
   )
   public class560() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4033(byte arg0) {
      try {
         field7677 = null;
         if (arg0 < 25) {
            field7677 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7683[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4034(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4035(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
