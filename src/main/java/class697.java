import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class697 {
   @OriginalMember(
      owner = "client!ab",
      name = "i",
      descriptor = "Lef;"
   )
   private class513 field10461;
   @OriginalMember(
      owner = "client!ab",
      name = "f",
      descriptor = "I"
   )
   public int field10457;
   @OriginalMember(
      owner = "client!ab",
      name = "d",
      descriptor = "I"
   )
   private int field10462;
   @OriginalMember(
      owner = "client!ab",
      name = "n",
      descriptor = "I"
   )
   public int field10460;
   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10473 = new String[]{method5061(method5060("X2\u0013RN")), method5061(method5060("B~\u0013=\u001b")), method5061(method5060("W%Q\u007f")), method5061(method5060("X2\u0013/\u000fW9I-N")), method5061(method5060("X2\u0013QN")), method5061(method5060("X2\u0013g\tj$Oz\b^x")), method5061(method5060("X2\u0013WN"))};
   @OriginalMember(
      owner = "client!ab",
      name = "h",
      descriptor = "Lab;"
   )
   public static class697 field10459 = new class697(0, 3, class513.field7523);
   @OriginalMember(
      owner = "client!ab",
      name = "e",
      descriptor = "Lab;"
   )
   public static class697 field10463 = new class697(1, 3, class513.field7523);
   @OriginalMember(
      owner = "client!ab",
      name = "l",
      descriptor = "Lab;"
   )
   public static class697 field10465 = new class697(2, 4, class513.field7519);
   @OriginalMember(
      owner = "client!ab",
      name = "j",
      descriptor = "Lab;"
   )
   public static class697 field10467 = new class697(3, 1, class513.field7523);
   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "Lab;"
   )
   public static class697 field10468 = new class697(4, 2, class513.field7523);
   @OriginalMember(
      owner = "client!ab",
      name = "p",
      descriptor = "Lab;"
   )
   public static class697 field10469 = new class697(5, 3, class513.field7523);
   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "Lab;"
   )
   public static class697 field10470 = new class697(6, 4, class513.field7523);
   @OriginalMember(
      owner = "client!ab",
      name = "m",
      descriptor = "I"
   )
   public static int field10471 = class788.method5654(29990, 16);
   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field10472 = new class101(9, 4);
   @OriginalMember(
      owner = "client!ab",
      name = "g",
      descriptor = "I"
   )
   public static int field10458;
   @OriginalMember(
      owner = "client!ab",
      name = "k",
      descriptor = "I"
   )
   public static int field10464;
   @OriginalMember(
      owner = "client!ab",
      name = "o",
      descriptor = "I"
   )
   public static int field10466;

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IB)Lab;"
   )
   public static final class697 method5056(int arg0, byte arg1) {
      try {
         ++field10458;
         if (arg1 > -25) {
            field10470 = null;
         }

         if (arg0 != 0) {
            if (~arg0 == -2) {
               return field10463;
            }

            if (arg0 == 2) {
               return field10465;
            }

            if (~arg0 == -4) {
               return field10467;
            }

            if (~arg0 == -5) {
               return field10468;
            }

            if (~arg0 == -6) {
               return field10469;
            }

            if (arg0 != 6) {
               return null;
            }

            if (client.field4530 == 0) {
               return field10470;
            }
         }

         return field10459;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10473[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method5057(int arg0) {
      int var1 = client.field4530;

      try {
         ++field10464;
         boolean var2 = true;
         if (class409.field6235 == null) {
            label67: {
               if (!class521.field7580.method3884((byte)-99, class272.field3788)) {
                  var2 = false;
                  if (var1 == 0) {
                     break label67;
                  }
               }

               class409.field6235 = class671.method4890(class521.field7580, class272.field3788);
            }
         }

         if (class16.field189 == null) {
            label61: {
               if (class521.field7580.method3884((byte)-99, class70.field877)) {
                  class16.field189 = class671.method4890(class521.field7580, class70.field877);
                  if (var1 == 0) {
                     break label61;
                  }
               }

               var2 = false;
            }
         }

         if (arg0 != -32151) {
            field10463 = null;
         }

         if (class154.field1942 == null) {
            label54: {
               if (class521.field7580.method3884((byte)-99, class139.field1792)) {
                  class154.field1942 = class671.method4890(class521.field7580, class139.field1792);
                  if (var1 == 0) {
                     break label54;
                  }
               }

               var2 = false;
            }
         }

         if (class482.field7162 == null) {
            label48: {
               if (!class712.field10625.method3884((byte)-99, class416.field6366)) {
                  var2 = false;
                  if (var1 == 0) {
                     break label48;
                  }
               }

               class482.field7162 = class145.method1203((byte)79, class712.field10625, class416.field6366);
            }
         }

         if (class589.field8723 == null) {
            if (!class521.field7580.method3884((byte)-99, class416.field6366)) {
               var2 = false;
               if (var1 == 0) {
                  return var2;
               }
            }

            class589.field8723 = class671.method4884(class521.field7580, class416.field6366);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10473[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5058(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (class173.field2163 != null) {
         class173.field2163[arg0][arg1] = -16777216 | arg2;
      }

      if (class661.field9571 != null) {
         class661.field9571[arg0][arg1] = (short)arg3;
      }

      if (class583.field8642 != null) {
         class583.field8642[arg0][arg1] = (byte)arg4;
      }

   }

   @OriginalMember(
      owner = "client!ab",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10466;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10473[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5059(boolean arg0) {
      try {
         field10470 = null;
         field10472 = null;
         field10459 = null;
         field10468 = null;
         field10463 = null;
         field10467 = null;
         field10465 = null;
         field10469 = null;
         if (arg0) {
            field10468 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10473[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "<init>",
      descriptor = "(IILef;)V"
   )
   private class697(int arg0, int arg1, class513 arg2) {
      try {
         this.field10461 = arg2;
         this.field10457 = arg0;
         this.field10462 = arg1;
         this.field10460 = this.field10461.field7515 * this.field10462;
         if (this.field10457 >= 16) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10473[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10473[1] : field10473[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5060(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5061(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
