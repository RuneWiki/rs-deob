import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class583 implements Runnable {
   @OriginalMember(
      owner = "client!ag",
      name = "i",
      descriptor = "[Lnd;"
   )
   public volatile class785[] field8190 = new class785[2];
   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "Z"
   )
   public volatile boolean field8191 = false;
   @OriginalMember(
      owner = "client!ag",
      name = "h",
      descriptor = "Z"
   )
   public volatile boolean field8188 = false;
   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8196 = new String[]{method4290(method4289("\u0015Q\u0007\u0019n\u001a\u001e")), method4290(method4289("\u0015Q\u0007/3")), method4290(method4289("\u0015Q\u0007*3")), method4290(method4289("\u0015Q\u0007(3"))};
   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "Lsb;"
   )
   public static class261 field8187 = new class261();
   @OriginalMember(
      owner = "client!ag",
      name = "e",
      descriptor = "[C"
   )
   public static char[] field8195 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @OriginalMember(
      owner = "client!ag",
      name = "d",
      descriptor = "I"
   )
   public static int field8186;
   @OriginalMember(
      owner = "client!ag",
      name = "j",
      descriptor = "I"
   )
   public static int field8189;
   @OriginalMember(
      owner = "client!ag",
      name = "c",
      descriptor = "I"
   )
   public static int field8193;
   @OriginalMember(
      owner = "client!ag",
      name = "g",
      descriptor = "I"
   )
   public static int field8194;
   @OriginalMember(
      owner = "client!ag",
      name = "f",
      descriptor = "Lfea;"
   )
   public class82 field8192;

   @OriginalMember(
      owner = "client!ag",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field10022;

      try {
         this.field8188 = true;
         ++field8186;

         try {
            if (var1 || !this.field8191) {
               do {
                  int var2 = 0;
                  if (var1 || var2 < 2) {
                     do {
                        class785 var3 = this.field8190[var2];
                        if (var3 != null) {
                           var3.method5672(1);
                        }

                        ++var2;
                     } while(var2 < 2);
                  }

                  class97.method968(32353, 10L);
                  class19.method267((Object)null, this.field8192, (byte)-107);
               } while(!this.field8191);
            }
         } catch (Exception var12) {
            class117.method1138(76, (String)null, var12);
         } finally {
            Object var8 = null;
            this.field8188 = false;
         }

      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field8196[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4285(int arg0) {
      try {
         field8195 = null;
         field8187 = null;
         if (arg0 >= -60) {
            method4286(-123, 37, -112);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8196[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4286(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      if (var3 != null) {
         class631.method4625(var3.field4679);
         class631.method4625(var3.field4690);
         if (var3.field4679 != null) {
            var3.field4679 = null;
         }

         if (var3.field4690 != null) {
            var3.field4690 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(IIZIBII)V"
   )
   public static final void method4287(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         ++field8193;
         class268.field4118 = arg1;
         class750.field10661 = arg3;
         class768.field11025 = arg0;
         if (arg4 > 100) {
            class333.field4946 = arg6;
            class553.field7884 = arg5;
            if (arg2 && class750.field10661 >= 100) {
               class222.field3158 = class768.field11025 * 512 - -256;
               class670.field9407 = class268.field4118 * 512 + 256;
               class576.field8141 = class478.method3658(class128.field2049, class670.field9407, class222.field3158, (byte)-20) + -class553.field7884;
            }

            class27.field402 = -1;
            class555.field7892 = -1;
            class306.field4639 = 2;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8196[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4288(byte arg0) {
      try {
         class522.field7355 = -1;
         class359.field5306 = 0;
         if (arg0 >= -54) {
            field8187 = null;
         }

         class269.field4123 = -1;
         class11.field180 = -1;
         ++field8189;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8196[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4289(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4290(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
