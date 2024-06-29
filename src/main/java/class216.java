import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class216 {
   @OriginalMember(
      owner = "client!tw",
      name = "j",
      descriptor = "I"
   )
   public int field3087;
   @OriginalMember(
      owner = "client!tw",
      name = "g",
      descriptor = "S"
   )
   public short field3090;
   @OriginalMember(
      owner = "client!tw",
      name = "l",
      descriptor = "I"
   )
   public int field3098;
   @OriginalMember(
      owner = "client!tw",
      name = "m",
      descriptor = "Z"
   )
   public boolean field3096;
   @OriginalMember(
      owner = "client!tw",
      name = "c",
      descriptor = "B"
   )
   public byte field3089;
   @OriginalMember(
      owner = "client!tw",
      name = "e",
      descriptor = "I"
   )
   public int field3094;
   @OriginalMember(
      owner = "client!tw",
      name = "h",
      descriptor = "I"
   )
   public int field3097;
   @OriginalMember(
      owner = "client!tw",
      name = "n",
      descriptor = "I"
   )
   public int field3095;
   @OriginalMember(
      owner = "client!tw",
      name = "b",
      descriptor = "S"
   )
   public short field3085;
   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "S"
   )
   public short field3086;
   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3099 = new String[]{method1710(method1709("z&zGG")), method1710(method1709("z&z8\u0006`8 :G")), method1710(method1709("z&zEG"))};
   @OriginalMember(
      owner = "client!tw",
      name = "d",
      descriptor = "I"
   )
   public static int field3088;
   @OriginalMember(
      owner = "client!tw",
      name = "i",
      descriptor = "I"
   )
   public static int field3092;
   @OriginalMember(
      owner = "client!tw",
      name = "k",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field3093;
   @OriginalMember(
      owner = "client!tw",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field3091;

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1705(boolean arg0) {
      try {
         field3093 = null;
         if (arg0) {
            method1708(-9, -55, 73);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3099[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(II)Ldu;"
   )
   public static final class377 method1706(int arg0, int arg1) {
      try {
         ++field3092;
         class377 var2 = (class377)class295.field4069.method725(0, (long)arg0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class599.field8806.method2037(false, arg0, arg1);
            class377 var4 = new class377();
            var4.field5434 = arg0;
            if (var3 != null) {
               var4.method2855(new class147(var3), (byte)-128);
            }

            var4.method2859(-2);
            if (~var4.field5432 == -3 && class543.field7802.method329((byte)-47, (long)arg0) == null) {
               class543.field7802.method336(arg1 + -2, (long)arg0, new class713(class636.field9307));
               class708.field10336[class636.field9307++] = var4;
            }

            class295.field4069.method723(arg1 ^ 1, (long)arg0, var4);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3099[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1707(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      if (var3 != null) {
         class32.method286(var3.field7464);
         if (var3.field7464 != null) {
            var3.field7464 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "b",
      descriptor = "(III)Lta;"
   )
   public static final class226 method1708(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      return var3 != null && var3.field7464 != null ? var3.field7464 : null;
   }

   @OriginalMember(
      owner = "client!tw",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field3087 = arg3;
         this.field3090 = (short)arg6;
         this.field3098 = arg0;
         this.field3096 = arg10;
         this.field3089 = (byte)arg8;
         this.field3094 = arg2;
         this.field3097 = arg11;
         this.field3095 = arg1;
         this.field3085 = (short)arg5;
         this.field3086 = (short)arg4;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field3099[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1709(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1710(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
