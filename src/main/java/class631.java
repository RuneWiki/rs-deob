import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class631 {
   @OriginalMember(
      owner = "client!cf",
      name = "f",
      descriptor = "I"
   )
   private int field9252;
   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9255 = new String[]{method4573(method4572("\u001bLF]h")), method4573(method4572("\u001bLF[h")), method4573(method4572("\u001bLF\\h")), method4573(method4572("\u001bLF^h")), method4573(method4572("\u0016_\u0004s")), method4573(method4572("\u001bLF#)\u0016C\u001c!h")), method4573(method4572("\u0003\u0004F1="))};
   @OriginalMember(
      owner = "client!cf",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field9251 = new int[256];
   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "I"
   )
   public static int field9249;
   @OriginalMember(
      owner = "client!cf",
      name = "b",
      descriptor = "I"
   )
   public static int field9250;
   @OriginalMember(
      owner = "client!cf",
      name = "e",
      descriptor = "I"
   )
   public static int field9254;
   @OriginalMember(
      owner = "client!cf",
      name = "c",
      descriptor = "Ltv;"
   )
   public static class587 field9253;

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4568(int arg0) {
      try {
         field9253 = null;
         if (arg0 != 73) {
            method4568(4);
         }

         field9251 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9255[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4569(int arg0, byte arg1) {
      try {
         ++field9249;
         if (arg1 >= -83) {
            this.field9252 = -43;
         }

         OpenGL.glNewList(this.field9252 + arg0, 4864);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9255[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4570(int arg0) {
      try {
         if (arg0 != 256) {
            field9253 = null;
         }

         OpenGL.glEndList();
         ++field9254;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9255[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "<init>",
      descriptor = "(Lea;I)V"
   )
   public class631(class573 arg0, int arg1) {
      try {
         this.field9252 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9255[5] + (arg0 != null ? field9255[6] : field9255[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(ZC)V"
   )
   public final void method4571(boolean arg0, char arg1) {
      try {
         ++field9250;
         if (!arg0) {
            OpenGL.glCallList(this.field9252 - -arg1);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9255[1] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      new class475("", 73);
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
