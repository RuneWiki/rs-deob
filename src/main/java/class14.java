import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 extends class707 {
   @OriginalMember(
      owner = "client!ma",
      name = "s",
      descriptor = "I"
   )
   private int field197;
   @OriginalMember(
      owner = "client!ma",
      name = "t",
      descriptor = "I"
   )
   private int field198;
   @OriginalMember(
      owner = "client!ma",
      name = "D",
      descriptor = "I"
   )
   public int field196;
   @OriginalMember(
      owner = "client!ma",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field209 = new String[]{method102(method101("5vA\u0003j")), method102(method101("6b\u0003.")), method102(method101("5vA~+6~\u001b|j")), method102(method101("#9Al?")), method102(method101("5vA\u0000j")), method102(method101("5vA\fj")), method102(method101("(s")), method102(method101("5vA\u0012j")), method102(method101("5vA\u000fj")), method102(method101("5vA\rj"))};
   @OriginalMember(
      owner = "client!ma",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field202 = new int[14];
   @OriginalMember(
      owner = "client!ma",
      name = "u",
      descriptor = "D"
   )
   public static double field203;
   @OriginalMember(
      owner = "client!ma",
      name = "B",
      descriptor = "I"
   )
   public static int field199;
   @OriginalMember(
      owner = "client!ma",
      name = "v",
      descriptor = "I"
   )
   public static int field200;
   @OriginalMember(
      owner = "client!ma",
      name = "w",
      descriptor = "I"
   )
   public static int field201;
   @OriginalMember(
      owner = "client!ma",
      name = "y",
      descriptor = "I"
   )
   public static int field204;
   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "I"
   )
   public static int field205;
   @OriginalMember(
      owner = "client!ma",
      name = "r",
      descriptor = "I"
   )
   public static int field206;
   @OriginalMember(
      owner = "client!ma",
      name = "x",
      descriptor = "I"
   )
   public static int field207;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ma",
      name = "C",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field208;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method100(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IBII)Z",
      line = 3
   )
   public static final boolean method94(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field207;
         if (arg1 != 35) {
            return true;
         } else {
            class268 var4 = (class268)class245.method1990(arg2, arg3, arg0);
            boolean var5 = true;
            if (var4 != null) {
               var5 &= class367.method2867(120, var4);
            }

            class268 var6 = (class268)class740.method5337(arg2, arg3, arg0, field208 != null ? field208 : (field208 = method100(field209[6])));
            if (var6 != null) {
               var5 &= class367.method2867(113, var6);
            }

            class268 var7 = (class268)class439.method3309(arg2, arg3, arg0);
            if (var7 != null) {
               var5 &= class367.method2867(94, var7);
            }

            return var5;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field209[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "<init>",
      descriptor = "(Lrk;IIZ[[I)V",
      line = 33
   )
   public class14(class35 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 64
   )
   public static final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (~class510.field7454.field11152.method684(false) != arg3 && ~arg0 != -1 && class621.field9054 < 50 && arg5 != -1) {
            class123.field1969[class621.field9054++] = new class377((byte)1, arg5, arg0, arg1, arg2, 0, arg4, (class294)null);
         }

         ++field200;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field209[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "<init>",
      descriptor = "(Lrk;IIZ[[BI)V",
      line = 114
   )
   public class14(class35 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ma",
      name = "<init>",
      descriptor = "(Lrk;II)V",
      line = 151
   )
   public class14(class35 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(I)V",
      line = 85
   )
   public final void method96(int arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field197, this.field198, 3553, 0, 0);
         int var2 = -49 / ((arg0 - 6) / 46);
         ++field204;
         this.field198 = -1;
         this.field197 = -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field209[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIIZI)V",
      line = 97
   )
   public final void method97(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         if (arg3) {
            ++field206;
            OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.field10271, arg4);
            this.field198 = arg2;
            this.field197 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field209[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "e",
      descriptor = "(I)V",
      line = 138
   )
   public static void method98(int arg0) {
      try {
         if (arg0 == -22614) {
            field202 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field209[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "f",
      descriptor = "(I)V",
      line = 168
   )
   public static final void method99(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field201;
         class479 var2 = null;

         try {
            class789 var3 = class412.field6033.method4789("", -5160, true);
            if (var1) {
               class624.method4569((byte)98, 1L);
            }

            while(true) {
               int var10000;
               if (~var3.field11542 != -1) {
                  var10000 = ~var3.field11542;
                  if (!var1) {
                     if (var10000 == -2) {
                        var2 = (class479)var3.field11537;
                        class473 var4 = class510.field7454.method5558(false);
                        var2.method3630(0, var4.field6907, -123, var4.field6889);
                     }
                     break;
                  }
               } else {
                  var10000 = 98;
               }

               class624.method4569((byte)var10000, 1L);
            }
         } catch (Exception var8) {
         }

         int var5 = 26 % ((arg0 - -44) / 44);

         try {
            if (var2 != null) {
               var2.method3627((byte)2);
            }
         } catch (Exception var7) {
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field209[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method101(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method102(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
