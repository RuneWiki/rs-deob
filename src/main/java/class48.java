import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class48 {
   @OriginalMember(
      owner = "client!bt",
      name = "c",
      descriptor = "Leaa;"
   )
   private class526 field576;
   @OriginalMember(
      owner = "client!bt",
      name = "f",
      descriptor = "I"
   )
   public int field582;
   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field586 = new String[]{method388(method387("i\u001ea5\f")), method388(method387("i\u001ea2\f")), method388(method387("e\u001f#\u001a")), method388(method387("pDaXY")), method388(method387("i\u001ea3\f")), method388(method387("i\u001eaJMe\u0003;H\f")), method388(method387("X\u0002.\u0012AyJ,\u0019I{\u0003#\u0013\u0004m\u000b&\u001aAoP")), method388(method387("i\u001ea7\f"))};
   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "I"
   )
   public static int field578 = 0;
   @OriginalMember(
      owner = "client!bt",
      name = "j",
      descriptor = "Lsd;"
   )
   public static class101 field581 = new class101(42, 6);
   @OriginalMember(
      owner = "client!bt",
      name = "h",
      descriptor = "I"
   )
   public static int field579;
   @OriginalMember(
      owner = "client!bt",
      name = "e",
      descriptor = "I"
   )
   public static int field580;
   @OriginalMember(
      owner = "client!bt",
      name = "b",
      descriptor = "I"
   )
   public static int field584;
   @OriginalMember(
      owner = "client!bt",
      name = "i",
      descriptor = "I"
   )
   public static int field585;
   @OriginalMember(
      owner = "client!bt",
      name = "g",
      descriptor = "Leaa;"
   )
   public static class526 field577;
   @OriginalMember(
      owner = "client!bt",
      name = "d",
      descriptor = "Lpe;"
   )
   public static class634 field583;

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "([Lvs;II)V",
      line = 6
   )
   public static final void method382(class616[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class616 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field9000;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field9000 > (var7 & 1) + var6) {
               class616 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method382(arg0, arg1, var4 - 1);
         method382(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(ILjava/lang/String;)V",
      line = 45
   )
   public static final void method383(int arg0, String arg1) {
      try {
         ++field585;
         class180 var2 = class370.method2879(-72);
         var2.field2211.method1085(class185.field2306.field11435, (byte)-11);
         var2.field2211.method1103(0, -97);
         int var3 = var2.field2211.field1590;
         var2.field2211.method1103(651, -117);
         if (arg0 > -105) {
            method382((class616[])null, -80, -105);
         }

         int[] var4 = class481.method3570(var2, (byte)85);
         int var5 = var2.field2211.field1590;
         var2.field2211.method1101(arg1, -69);
         var2.field2211.method1085(class728.field10827, (byte)-11);
         var2.field2211.field1590 += 7;
         var2.field2211.method1089(var5, (byte)66, var4, var2.field2211.field1590);
         var2.field2211.method1068(-var3 + var2.field2211.field1590, (byte)-126);
         class763.method5527(false, var2);
         class578.field8576 = 1;
         class489.field7223 = 0;
         class236.field2995 = -3;
         class330.field4725 = 0;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field586[1] + arg0 + ',' + (arg1 != null ? field586[3] : field586[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(B)V",
      line = 80
   )
   public static void method384(byte arg0) {
      try {
         field581 = null;
         if (arg0 != -93) {
            field579 = -85;
         }

         field577 = null;
         field583 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field586[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(BILjava/lang/String;Lck;)Liga;",
      line = 99
   )
   public static final class481 method385(byte arg0, int arg1, String arg2, class667 arg3) {
      try {
         ++field584;
         if (arg0 > -88) {
            method383(-13, (String)null);
         }

         long var4 = OpenGL.glCreateShaderObjectARB(arg1);
         OpenGL.glShaderSourceARB(var4, arg2);
         OpenGL.glCompileShaderARB(var4);
         OpenGL.glGetObjectParameterivARB(var4, 35713, class186.field2334, 0);
         if (~class186.field2334[0] == -1) {
            if (class186.field2334[0] == 0) {
               System.out.println(field586[6]);
            }

            OpenGL.glGetObjectParameterivARB(var4, 35716, class186.field2334, 1);
            if (class186.field2334[1] > 1) {
               byte[] var6 = new byte[class186.field2334[1]];
               OpenGL.glGetInfoLogARB(var4, class186.field2334[1], class186.field2334, 0, var6, 0);
               System.out.println(new String(var6));
            }

            if (class186.field2334[0] == 0) {
               OpenGL.glDeleteObjectARB(var4);
               return null;
            }
         }

         return new class481(arg3, var4, arg1);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field586[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field586[3] : field586[2]) + ',' + (arg3 != null ? field586[3] : field586[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(IB)Z",
      line = 141
   )
   public static final boolean method386(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 != 23) {
            method382((class616[])null, 124, -15);
         }

         ++field580;
         class303 var3 = (class303)class459.field6947.method4071((byte)126);
         boolean var10000;
         if (var2 != 0) {
            var10000 = class550.method4065(var3.field4333, 118);
         } else if (var3 == null) {
            var10000 = false;
            if (var2 == 0) {
               return false;
            }
         } else {
            var10000 = class550.method4065(var3.field4333, 118);
         }

         while(!var10000 || (long)arg0 != var3.field4324) {
            var3 = (class303)class459.field6947.method4059((byte)106);
            if (var3 == null) {
               var10000 = false;
               if (var2 == 0) {
                  return false;
               }
            } else {
               var10000 = class550.method4065(var3.field4333, 118);
            }
         }

         return true;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field586[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 178
   )
   public class48(class24 arg0, int arg1, class526 arg2) {
      new class748(64);

      try {
         this.field576 = arg2;
         this.field582 = this.field576.method3875(0, 15);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field586[5] + (arg0 != null ? field586[3] : field586[2]) + ',' + arg1 + ',' + (arg2 != null ? field586[3] : field586[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
