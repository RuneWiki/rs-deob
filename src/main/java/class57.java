import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class57 {
   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "Z"
   )
   public boolean field821 = true;
   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field822 = new String[]{method594(method593("\u0016\u000f*@")), method594(method593("\u0003Th\u0002:")), method594(method593("\u0017\bhmo")), method594(method593("\u0017\bhoo")), method594(method593("\u0017\bhno")), method594(method593("\u0017\bhio")), method594(method593("\u0017\bhho"))};
   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field814 = new int[256];
   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "C"
   )
   private char field813;
   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "I"
   )
   public static int field815;
   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "I"
   )
   public int field816;
   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "I"
   )
   public static int field817;
   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "I"
   )
   public static int field818;
   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "I"
   )
   public static int field820;
   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field819;

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method588(int arg0) {
      try {
         if (arg0 <= -16) {
            field814 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field822[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljava/awt/Component;B)Lhk;"
   )
   public static final class638 method589(Component arg0, byte arg1) {
      try {
         if (arg1 <= 26) {
            return null;
         } else {
            ++field817;
            return new class711(arg0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field822[3] + (arg0 != null ? field822[1] : field822[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   private final void method590(class65 arg0, int arg1, int arg2) {
      try {
         ++field818;
         if (arg2 != 256) {
            method588(46);
         }

         if (~arg1 == -2) {
            this.field813 = class571.method4230(arg0.method638(true), -110);
         } else {
            if (~arg1 != -3) {
               if (~arg1 == -5) {
                  this.field821 = false;
                  return;
               }

               if (~arg1 == -6) {
                  this.field819 = arg0.method640((byte)51);
                  return;
               }
            } else {
               this.field816 = arg0.method701(255);
            }

         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field822[5] + (arg0 != null ? field822[1] : field822[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method591(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 < -82) {
            while(true) {
               int var4 = arg0.method665(false);
               if (var4 != 0) {
                  this.method590(arg0, var4, 256);
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     continue;
                  }
               }

               ++field820;
               break;
            }

         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field822[2] + (arg0 != null ? field822[1] : field822[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method592(int arg0) {
      try {
         ++field815;
         if (arg0 != -4099) {
            return false;
         } else {
            return this.field813 == 's';
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field822[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method593(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method594(char[] arg0) {
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
            var10005 = 122;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
