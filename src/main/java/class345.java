import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class class345 {
   @OriginalMember(
      owner = "client!hp",
      name = "d",
      descriptor = "Lob;"
   )
   public class768 field4914;
   @OriginalMember(
      owner = "client!hp",
      name = "c",
      descriptor = "I"
   )
   public int field4913;
   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4920 = new String[]{method2672(method2671("Uvs\u0013T")), method2672(method2671("F(sl\u0001")), method2672(method2671("@-1Q")), method2672(method2671("F(so\u0001")), method2672(method2671("F(sr\u0001")), method2672(method2671("F(sm\u0001")), method2672(method2671("F(s\u0001@@1)\u0003\u0001"))};
   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "Lhea;"
   )
   public static class443 field4912 = new class443();
   @OriginalMember(
      owner = "client!hp",
      name = "g",
      descriptor = "I"
   )
   public static int field4915;
   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "I"
   )
   public static int field4916;
   @OriginalMember(
      owner = "client!hp",
      name = "f",
      descriptor = "I"
   )
   public static int field4918;
   @OriginalMember(
      owner = "client!hp",
      name = "e",
      descriptor = "I"
   )
   public static int field4919;
   @OriginalMember(
      owner = "client!hp",
      name = "h",
      descriptor = "[Ltd;"
   )
   public static class476[] field4917;

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IB)V"
   )
   public abstract void method54(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(BI)I"
   )
   public abstract int method52(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class345(class768 arg0) {
      try {
         this.field4914 = arg0;
         this.field4913 = this.method53(false);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4920[6] + (arg0 != null ? field4920[0] : field4920[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class345(int arg0, class768 arg1) {
      try {
         this.field4913 = arg0;
         this.field4914 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4920[6] + arg0 + ',' + (arg1 != null ? field4920[0] : field4920[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2667(int arg0) {
      try {
         field4917 = null;
         int var1 = 70 % ((-26 - arg0) / 49);
         field4912 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4920[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2668(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field4912 = null;
         }

         ++field4915;
         if (~this.method52((byte)-54, arg0) != -4) {
            this.method54(arg0, (byte)113);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4920[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Ljava/lang/String;IILrk;)Lvi;"
   )
   public static final class563 method2669(String arg0, int arg1, int arg2, class35 arg3) {
      try {
         ++field4918;
         int var4 = OpenGL.glGenProgramARB();
         OpenGL.glBindProgramARB(arg2, var4);
         OpenGL.glProgramStringARB(arg2, 34933, arg0);
         if (arg1 != -8812) {
            method2669((String)null, 95, -105, (class35)null);
         }

         OpenGL.glGetIntegerv(34379, class426.field6172, 0);
         if (~class426.field6172[0] != 0) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
         } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class563(arg3, arg2, var4);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4920[1] + (arg0 != null ? field4920[0] : field4920[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4920[0] : field4920[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IBI)Ljfa;"
   )
   public static final class303 method2670(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 < 88) {
            field4912 = null;
         }

         ++field4919;
         class303 var3 = class532.method3986(true, arg2);
         if (arg0 == -1) {
            return var3;
         } else {
            return var3 != null && var3.field4322 != null && ~var3.field4322.length < ~arg0 ? var3.field4322[arg0] : null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4920[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method53(boolean arg0);

   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method51(int arg0);

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2671(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2672(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
