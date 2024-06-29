import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class223 {
   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "Z"
   )
   public boolean field3169;
   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3174 = new String[]{method1921(method1920("\u001c\u0017|mk]")), method1921(method1920("\u001c\u0017|mh]")), method1921(method1920("\u001c\u0017|ml]")), method1921(method1920("\u001c\u0017|mm]")), method1921(method1920("\u001c\u0017|mj]")), method1921(method1920("\u001c\u0017|m\u0015\u001c\u0012t7\u0017]"))};
   @OriginalMember(
      owner = "client!ika",
      name = "d",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field3167 = new Rectangle[100];
   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "I"
   )
   public static int field3164;
   @OriginalMember(
      owner = "client!ika",
      name = "e",
      descriptor = "I"
   )
   public static int field3166;
   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "I"
   )
   public static int field3168;
   @OriginalMember(
      owner = "client!ika",
      name = "g",
      descriptor = "I"
   )
   public static int field3171;
   @OriginalMember(
      owner = "client!ika",
      name = "k",
      descriptor = "I"
   )
   public static int field3172;
   @OriginalMember(
      owner = "client!ika",
      name = "i",
      descriptor = "Lfha;"
   )
   public static class411 field3173;
   @OriginalMember(
      owner = "client!ika",
      name = "j",
      descriptor = "Ldca;"
   )
   public class581 field3163;
   @OriginalMember(
      owner = "client!ika",
      name = "h",
      descriptor = "Ldca;"
   )
   public class581 field3170;
   @OriginalMember(
      owner = "client!ika",
      name = "f",
      descriptor = "Z"
   )
   public boolean field3165;

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method1915(int arg0, boolean arg1) {
      try {
         ++field3166;
         class452 var2 = (class452)class704.field10127.method3101(-1, (long)arg0);
         if (var2 != null) {
            var2.field6589 = !var2.field6589;
            var2.field6590.method4114(var2.field6589, -1);
         }

         if (arg1) {
            method1916(true, true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3174[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method1916(boolean arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         ++field3172;
         class622.method4576((byte)-73);
         if (class696.method5094(class394.field5712, 31215)) {
            class242[] var3 = class745.field10606;
            int var4 = 0;
            if (!var2 && ~var3.length >= ~var4) {
               if (arg0) {
                  method1918(-33);
               }

               class622.method4576((byte)-33);
            } else {
               do {
                  class242 var5 = var3[var4];
                  ++var5.field3731;
                  if (var5.field3731 < 50 && !arg1) {
                     return;
                  }

                  var5.field3731 = 0;
                  if (!var5.field3726 && var5.field3713 != null) {
                     ++class348.field5115;
                     class381 var6 = class801.method5775(class553.field7879, 0, var5.field3718);
                     var5.method2111(14024, var6);

                     try {
                        var5.method2115((byte)0);
                     } catch (IOException var8) {
                        var5.field3726 = true;
                     }
                  }

                  ++var4;
               } while(~var3.length < ~var4);

               if (arg0) {
                  method1918(-33);
               }

               class622.method4576((byte)-33);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3174[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1917(byte arg0) {
      try {
         if (arg0 >= -31) {
            this.field3163 = null;
         }

         ++field3168;
         if (this.field3170 != null) {
            this.field3170.method358(true);
         }

         this.field3165 = false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3174[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1918(int arg0) {
      try {
         field3173 = null;
         int var1 = 3 % ((arg0 - -45) / 61);
         field3167 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3174[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1919(byte arg0) {
      try {
         if (arg0 < 40) {
            this.field3170 = null;
         }

         ++field3164;
         return this.field3165 && !this.field3169;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3174[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class223(boolean arg0) {
      try {
         this.field3169 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3174[5] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 100; ++var0) {
         field3167[var0] = new Rectangle();
      }

   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1920(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1921(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
