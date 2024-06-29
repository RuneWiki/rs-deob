import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public abstract class class195 {
   @OriginalMember(
      owner = "client!vda",
      name = "h",
      descriptor = "Z"
   )
   private boolean field2764;
   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "I"
   )
   private int field2768;
   @OriginalMember(
      owner = "client!vda",
      name = "e",
      descriptor = "Lea;"
   )
   public class573 field2762;
   @OriginalMember(
      owner = "client!vda",
      name = "j",
      descriptor = "I"
   )
   private int field2765;
   @OriginalMember(
      owner = "client!vda",
      name = "f",
      descriptor = "I"
   )
   public int field2763;
   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2770 = new String[]{method1534(method1533("O{\u0018?q")), method1534(method1533("Z Z}")), method1534(method1533("B1W?0];_e2\u001c")), method1534(method1533("B1W?D\u001c")), method1534(method1533("B1W?j];W}eN0\u001e")), method1534(method1533("B1W?J\u001c")), method1534(method1533("B1W?K\u001c"))};
   @OriginalMember(
      owner = "client!vda",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field2758 = new int[8];
   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "I"
   )
   public static int field2760;
   @OriginalMember(
      owner = "client!vda",
      name = "g",
      descriptor = "I"
   )
   public static int field2766;
   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "I"
   )
   public static int field2769;
   @OriginalMember(
      owner = "client!vda",
      name = "k",
      descriptor = "Ldga;"
   )
   public static class220 field2761;
   @OriginalMember(
      owner = "client!vda",
      name = "i",
      descriptor = "Ljf;"
   )
   public static class228 field2767;
   @OriginalMember(
      owner = "client!vda",
      name = "l",
      descriptor = "[Z"
   )
   public static boolean[] field2759;

   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method1529(byte arg0);

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(II)Lep;"
   )
   public static final class446 method1530(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field2769;
         class446[] var3 = class235.method1813(false);
         int var4 = 0;
         class446 var5;
         if (arg0 != 19729) {
            field2767 = null;
            if (var2) {
               var5 = var3[var4];
               if (var5.field6345 == arg1) {
                  return var5;
               }

               ++var4;
            }
         }

         while(~var3.length < ~var4) {
            var5 = var3[var4];
            if (var5.field6345 == arg1) {
               return var5;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2770[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(I[BZ)V"
   )
   public final void method1531(int arg0, byte[] arg1, boolean arg2) {
      try {
         if (arg2) {
            this.method1529((byte)-74);
         }

         this.method1529((byte)80);
         ++field2766;
         if (~arg0 < ~this.field2768) {
            OpenGL.glBufferDataARBub(this.field2765, arg0, arg1, 0, !this.field2764 ? 35044 : 35040);
            this.field2762.field8370 += arg0 - this.field2768;
            this.field2768 = arg0;
         } else {
            OpenGL.glBufferSubDataARBub(this.field2765, 0, arg0, arg1, 0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2770[6] + arg0 + ',' + (arg1 != null ? field2770[0] : field2770[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method1532(byte arg0) {
      try {
         field2761 = null;
         field2759 = null;
         if (arg0 > 74) {
            field2767 = null;
            field2758 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2770[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field2760;
         this.field2762.method4121(this.field2763, -2026728312, this.field2768);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2770[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "<init>",
      descriptor = "(Lea;I[BIZ)V"
   )
   public class195(class573 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field2764 = arg4;
         this.field2768 = arg3;
         this.field2762 = arg0;
         this.field2765 = arg1;
         OpenGL.glGenBuffersARB(1, class728.field10670, 0);
         this.field2763 = class728.field10670[0];
         this.method1529((byte)-125);
         OpenGL.glBufferDataARBub(arg1, this.field2768, arg2, 0, !this.field2764 ? 35044 : 35040);
         this.field2762.field8370 += this.field2768;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2770[2] + (arg0 != null ? field2770[0] : field2770[1]) + ',' + arg1 + ',' + (arg2 != null ? field2770[0] : field2770[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "<init>",
      descriptor = "(Lea;ILjaclib/memory/Buffer;IZ)V"
   )
   public class195(class573 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field2765 = arg1;
         this.field2762 = arg0;
         this.field2764 = arg4;
         this.field2768 = arg3;
         OpenGL.glGenBuffersARB(1, class728.field10670, 0);
         this.field2763 = class728.field10670[0];
         this.method1529((byte)-117);
         OpenGL.glBufferDataARBa(arg1, this.field2768, arg2.getAddress(), this.field2764 ? 35040 : 35044);
         this.field2762.field8370 += this.field2768;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2770[2] + (arg0 != null ? field2770[0] : field2770[1]) + ',' + arg1 + ',' + (arg2 != null ? field2770[0] : field2770[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1533(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1534(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
