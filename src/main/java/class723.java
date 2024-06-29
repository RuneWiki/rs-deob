import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class723 extends class456 {
   @OriginalMember(
      owner = "client!jha",
      name = "v",
      descriptor = "[I"
   )
   private int[] field10765;
   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10773 = new String[]{method5249(method5248("/3\u001a|&m")), method5249(method5248("/3\u001a|!m")), method5249(method5248("/3\u001a|;m")), method5249(method5248("/3\u001a|/m")), method5249(method5248("/3\u001a|W,5\u0012&Um")), method5249(method5248("((\u00113\u001d$t")), method5249(method5248("/3\u001a|$m")), method5249(method5248("=cM}")), method5249(method5248("(:\u0018=\u0018j")), method5249(method5248("5+\u0018}")), method5249(method5248("22\u00156\u00042(T")), method5249(method5248("05\u0012$\u000e7(\u001a>D")), method5249(method5248("22\u0015")), method5249(method5248(")2\u0015'\u0013")), method5249(method5248(",hCd")), method5249(method5248(",nCd")), method5249(method5248("(:\u0018")), method5249(method5248(">uU|\u0016")), method5249(method5248("5+\u0018")), method5249(method5248("+.\u0017>")), method5249(method5248("=cM\r]q")), method5249(method5248("=cM")), method5249(method5248("$6\u001fd_")), method5249(method5248(")2\u0015'\u0013j")), method5249(method5248(",oCd")), method5249(method5248("=cM\r]qt")), method5249(method5248("/3\u001a|'m"))};
   @OriginalMember(
      owner = "client!jha",
      name = "y",
      descriptor = "I"
   )
   public static int field10762;
   @OriginalMember(
      owner = "client!jha",
      name = "s",
      descriptor = "I"
   )
   private int field10764;
   @OriginalMember(
      owner = "client!jha",
      name = "r",
      descriptor = "I"
   )
   public static int field10767;
   @OriginalMember(
      owner = "client!jha",
      name = "x",
      descriptor = "I"
   )
   public static int field10768;
   @OriginalMember(
      owner = "client!jha",
      name = "q",
      descriptor = "I"
   )
   public static int field10769;
   @OriginalMember(
      owner = "client!jha",
      name = "w",
      descriptor = "I"
   )
   public static int field10770;
   @OriginalMember(
      owner = "client!jha",
      name = "u",
      descriptor = "I"
   )
   public static int field10771;
   @OriginalMember(
      owner = "client!jha",
      name = "t",
      descriptor = "I"
   )
   private int field10772;
   @OriginalMember(
      owner = "client!jha",
      name = "p",
      descriptor = "Lgja;"
   )
   public static class54 field10766;
   @OriginalMember(
      owner = "client!jha",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field10763;

   @OriginalMember(
      owner = "client!jha",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class723(int param1, int param2, int param3, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2363(int arg0) {
      try {
         this.field10772 = 0;
         ++field10769;
         if (arg0 == -15243) {
            this.field10764 = 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10773[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(BIB)V"
   )
   public void method1943(byte arg0, int arg1, byte arg2) {
      try {
         int var4 = 92 / ((-77 - arg0) / 37);
         ++field10768;
         this.field10763[this.field10764++] = (byte)((class153.method1262(255, arg2) >> 1) + 127);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10773[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method2362(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 >= -68) {
            this.method2362(72, 47, (byte)-120);
         }

         ++field10770;
         this.field10772 += this.field10765[arg1] * arg0 >> 12;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10773[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(ILhg;Leaa;)V"
   )
   public static final void method5246(int arg0, class719 arg1, class526 arg2) {
      int var3 = client.field4530;

      try {
         label72: {
            class399.field6136 = "";
            class669.field10066 = arg2;
            ++field10767;
            class646.field9407 = arg1;
            if (!class80.field990.startsWith(field10773[12])) {
               if (class80.field990.startsWith(field10773[13])) {
                  class399.field6136 = class399.field6136 + field10773[23];
                  if (var3 == 0) {
                     break label72;
                  }
               }

               if (!class80.field990.startsWith(field10773[16])) {
                  break label72;
               }

               class399.field6136 = class399.field6136 + field10773[8];
               if (var3 == 0) {
                  break label72;
               }
            }

            class399.field6136 = class399.field6136 + field10773[10];
         }

         if (arg0 != -770208028) {
            method5246(2, (class719)null, (class526)null);
         }

         if (class646.field9407.field10706) {
            class399.field6136 = class399.field6136 + field10773[5];
         } else if (!class80.field991.startsWith(field10773[22]) && !class80.field991.startsWith(field10773[20])) {
            if (!class80.field991.startsWith(field10773[14]) && !class80.field991.startsWith(field10773[24]) && !class80.field991.startsWith(field10773[15]) && !class80.field991.startsWith(field10773[21])) {
               if (class80.field991.startsWith(field10773[18])) {
                  class399.field6136 = class399.field6136 + field10773[9];
               } else {
                  class399.field6136 = class399.field6136 + field10773[11];
               }
            } else {
               class399.field6136 = class399.field6136 + field10773[7];
            }
         } else {
            class399.field6136 = class399.field6136 + field10773[25];
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10773[6] + arg0 + ',' + (arg1 != null ? field10773[17] : field10773[19]) + ',' + (arg2 != null ? field10773[17] : field10773[19]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2364(int arg0) {
      try {
         this.field10772 = Math.abs(this.field10772);
         ++field10771;
         if (arg0 < 41) {
            this.field10765 = null;
         }

         if (this.field10772 >= 4096) {
            this.field10772 = 4095;
         }

         this.method1943((byte)118, this.field10764++, (byte)(this.field10772 >> 4));
         this.field10772 = 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10773[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5247(int arg0) {
      try {
         field10766 = null;
         int var1 = -7 / (arg0 / 57);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10773[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5248(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5249(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
