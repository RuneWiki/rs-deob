import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class721 extends class454 {
   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10567 = new String[]{method5242(method5241("\u001f\u0012>b8")), method5242(method5241("\u001f\u0012>c8")), method5242(method5241("\u001f\u0012>a8")), method5242(method5241("\u001f\u0012>`8")), method5242(method5241("\u001f\u0012>f8")), method5242(method5241("\u001f\u0012>e8")), method5242(method5241("\u0006[>\nm")), method5242(method5241("\u001f\u0012>g8")), method5242(method5241("\u0013\u0000|H"))};
   @OriginalMember(
      owner = "client!bg",
      name = "j",
      descriptor = "Laka;"
   )
   public static class418 field10560 = new class418(60, -1);
   @OriginalMember(
      owner = "client!bg",
      name = "l",
      descriptor = "Lvia;"
   )
   public static class627 field10565 = new class627();
   @OriginalMember(
      owner = "client!bg",
      name = "p",
      descriptor = "I"
   )
   public static int field10558;
   @OriginalMember(
      owner = "client!bg",
      name = "k",
      descriptor = "I"
   )
   public static int field10561;
   @OriginalMember(
      owner = "client!bg",
      name = "i",
      descriptor = "I"
   )
   public static int field10562;
   @OriginalMember(
      owner = "client!bg",
      name = "o",
      descriptor = "I"
   )
   public static int field10563;
   @OriginalMember(
      owner = "client!bg",
      name = "n",
      descriptor = "I"
   )
   public static int field10564;
   @OriginalMember(
      owner = "client!bg",
      name = "m",
      descriptor = "I"
   )
   public static int field10566;
   @OriginalMember(
      owner = "client!bg",
      name = "q",
      descriptor = "Lww;"
   )
   public static class339 field10559;

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5238(byte arg0) {
      try {
         field10560 = null;
         field10559 = null;
         if (arg0 < -17) {
            field10565 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10567[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5239(int arg0) {
      try {
         if (arg0 != -18033) {
            field10565 = null;
         }

         ++field10558;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10567[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field10561;
         return arg1 ? -83 : 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10567[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 <= -46) {
            super.field6263 = arg1;
            ++field10563;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10567[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class721(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            field10559 = null;
         }

         ++field10562;
         return 3;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10567[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class721(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field10566;
         if (arg0) {
            if (~super.field6263 > -1 || ~super.field6263 < -5) {
               super.field6263 = this.method23(1);
            }

         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10567[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Lpia;I)Ldv;"
   )
   public static final class131 method5240(class680 arg0, int arg1) {
      try {
         if (arg1 != -5) {
            return null;
         } else {
            class131 var2;
            label24: {
               ++field10564;
               if (class732.field10672 == null) {
                  var2 = new class131();
                  if (!client.field1481) {
                     break label24;
                  }
               }

               var2 = class732.field10672;
               class732.field10672 = class732.field10672.field1670;
               --class125.field1629;
               var2.field1670 = null;
            }

            var2.field1676 = arg0;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10567[7] + (arg0 != null ? field10567[6] : field10567[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5241(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5242(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
