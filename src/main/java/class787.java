import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class787 extends class38 implements class425 {
   @OriginalMember(
      owner = "client!f",
      name = "x",
      descriptor = "I"
   )
   private int field11515;
   @OriginalMember(
      owner = "client!f",
      name = "B",
      descriptor = "I"
   )
   private int field11517;
   @OriginalMember(
      owner = "client!f",
      name = "y",
      descriptor = "I"
   )
   private int field11516;
   @OriginalMember(
      owner = "client!f",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11523 = new String[]{method5673(method5672("68wAS=.u\u000e>34qO\u001397u")), method5673(method5672("90")), method5673(method5672(":wC\b")), method5673(method5672("2,mL")), method5673(method5672("'w/\u000e\u0000")), method5673(method5672(":wE\b")), method5673(method5672(":w=I\u00135-?\b"))};
   @OriginalMember(
      owner = "client!f",
      name = "D",
      descriptor = "Luw;"
   )
   public static class435 field11519 = new class435(49, 8);
   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "I"
   )
   public static int field11518;
   @OriginalMember(
      owner = "client!f",
      name = "E",
      descriptor = "Lek;"
   )
   public static class531 field11521;
   @OriginalMember(
      owner = "client!f",
      name = "C",
      descriptor = "Lgh;"
   )
   public static class572 field11520;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!f",
      name = "w",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11522;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5671(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(ZILjava/awt/Component;)Ljaa;",
      line = 3
   )
   public static final class639 method5669(boolean arg0, int arg1, Component arg2) {
      try {
         ++field11518;

         try {
            if (arg1 != 0) {
               field11519 = null;
            }

            Constructor var3 = Class.forName(field11523[1]).getDeclaredConstructor(field11522 != null ? field11522 : (field11522 = method5671(field11523[0])), Boolean.TYPE);
            return (class639)var3.newInstance(arg2, new Boolean(arg0));
         } catch (Throwable var5) {
            return new class339(arg2, arg0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11523[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11523[4] : field11523[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "<init>",
      descriptor = "(Lbba;Ltv;III[B)V",
      line = 21
   )
   public class787(class124 arg0, class584 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class209.field3106, arg2 * arg4 * arg3, false);

      try {
         this.field11515 = arg3;
         this.field11517 = arg2;
         this.field11516 = arg4;
         super.field922.method2806(false, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field924, 0, this.method466((byte)118), this.field11517, this.field11515, this.field11516, 0, class583.method4325(super.field905, 6406), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field11523[6] + (arg0 != null ? field11523[4] : field11523[3]) + ',' + (arg1 != null ? field11523[4] : field11523[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11523[4] : field11523[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(I)V",
      line = 44
   )
   public static void method5670(int arg0) {
      try {
         field11520 = null;
         field11521 = null;
         if (arg0 == 4213) {
            field11519 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11523[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5672(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5673(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
