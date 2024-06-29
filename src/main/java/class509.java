import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class509 {
   @OriginalMember(
      owner = "client!ol",
      name = "f",
      descriptor = "I"
   )
   public int field7789 = 1;
   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7794 = new String[]{method3962(method3961("\bpf\u001f")), method3962(method3961("\ti$1i")), method3962(method3961("\u001d+$]<")), method3962(method3961("\ti$0i")), method3962(method3961("\ti$2i"))};
   @OriginalMember(
      owner = "client!ol",
      name = "e",
      descriptor = "Lfq;"
   )
   public static class374 field7792 = null;
   @OriginalMember(
      owner = "client!ol",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field7787 = new class498(142, -2);
   @OriginalMember(
      owner = "client!ol",
      name = "g",
      descriptor = "C"
   )
   public char field7790;
   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "I"
   )
   public static int field7788;
   @OriginalMember(
      owner = "client!ol",
      name = "b",
      descriptor = "I"
   )
   public static int field7791;
   @OriginalMember(
      owner = "client!ol",
      name = "c",
      descriptor = "I"
   )
   public static int field7793;

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(B)V",
      line = 7
   )
   public static void method3958(byte arg0) {
      try {
         field7787 = null;
         field7792 = null;
         if (arg0 > -8) {
            method3958((byte)2);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7794[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(BLica;)V",
      line = 29
   )
   public final void method3959(byte arg0, class354 arg1) {
      try {
         ++field7793;

         while(true) {
            int var3 = arg1.method2855(-31007);
            if (~var3 == -1) {
               if (arg0 >= -32) {
                  this.field7789 = -27;
                  return;
               } else {
                  return;
               }
            }

            this.method3960(arg1, var3, 1);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7794[1] + arg0 + ',' + (arg1 != null ? field7794[2] : field7794[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(Lica;II)V",
      line = 58
   )
   private final void method3960(class354 arg0, int arg1, int arg2) {
      try {
         if (arg1 == arg2) {
            this.field7790 = class424.method3361((byte)105, arg0.method2886((byte)88));
         } else if (arg1 == 2) {
            this.field7789 = 0;
         }

         ++field7788;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7794[4] + (arg0 != null ? field7794[2] : field7794[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3961(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3962(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
