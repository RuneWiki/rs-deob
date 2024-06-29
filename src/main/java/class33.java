import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class33 {
   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field487 = new String[]{method270(method269("A~\",")), method270(method269("Fj`\u0006r")), method270(method269("T%`n'")), method270(method269("Fj`\u0003r"))};
   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "I"
   )
   public static int field484;
   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "I"
   )
   public static int field485;
   @OriginalMember(
      owner = "client!ia",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field486;

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method263(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field484;
         client var2 = class107.field1426;
         synchronized(class107.field1426) {
            if (class233.field2900 == null) {
               Container var3;
               label95: {
                  if (class570.field8391 != null) {
                     var3 = class570.field8391;
                     if (!var1) {
                        break label95;
                     }
                  }

                  if (class152.field1893 != null) {
                     var3 = class152.field1893;
                     if (!var1) {
                        break label95;
                     }
                  }

                  var3 = class329.field4545;
               }

               class282.field3917 = var3.getSize().width;
               class315.field4358 = var3.getSize().height;
               if (class570.field8391 == var3) {
                  Insets var4 = class570.field8391.getInsets();
                  class282.field3917 -= var4.right + var4.left;
                  class315.field4358 -= var4.top - -var4.bottom;
               }

               label77: {
                  if (~class137.method1146((byte)71) != -2) {
                     class112.method1010(24242);
                     if (!var1) {
                        break label77;
                     }
                  }

                  class543.field7943 = (-class286.field3961 + class282.field3917) / 2;
                  class204.field2605 = class286.field3961;
                  class549.field8088 = 0;
                  class91.field1242 = class627.field9254;
               }

               if (class781.field11380 != class583.field8611) {
                  boolean var10000;
                  if (~class204.field2605 > -1025 && class91.field1242 < 768) {
                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               }

               class590.field8691.setSize(class204.field2605, class91.field1242);
               if (arg0 != 89) {
                  method263((byte)92);
               }

               if (class629.field9294 != null) {
                  label63: {
                     if (!class28.field416) {
                        class629.field9294.method496(class590.field8691, class204.field2605, class91.field1242);
                        if (!var1) {
                           break label63;
                        }
                     }

                     class13.method113(11026, class590.field8691);
                  }
               }

               label58: {
                  if (class570.field8391 == var3) {
                     Insets var5 = class570.field8391.getInsets();
                     class590.field8691.setLocation(class543.field7943 + var5.left, class549.field8088 + var5.top);
                     if (!var1) {
                        break label58;
                     }
                  }

                  class590.field8691.setLocation(class543.field7943, class549.field8088);
               }

               if (class661.field9817 != -1) {
                  class491.method3730(true, false);
               }

               class729.method5273(0);
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field487[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(B)Leda;"
   )
   public abstract class134 method264(byte arg0);

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method265(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(II)I"
   )
   public abstract int method266(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(ZI)[B"
   )
   public abstract byte[] method267(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "([Ljava/lang/String;I[S)V"
   )
   public static final void method268(String[] arg0, int arg1, short[] arg2) {
      try {
         ++field485;
         class558.method4207(0, arg0.length + -1, false, arg2, arg0);
         if (arg1 != -22473) {
            field486 = false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field487[1] + (arg0 != null ? field487[2] : field487[0]) + ',' + arg1 + ',' + (arg2 != null ? field487[2] : field487[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
