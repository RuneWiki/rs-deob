import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class568 {
   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8359 = new String[]{method4272(method4271("\u0005zQ#n")), method4272(method4271("\u0005zQ!n")), method4272(method4271("\u0005zQ\"n")), method4272(method4271("\u0005zQ%n")), method4272(method4271("\u0007i\u0013\f")), method4272(method4271("\u00122QN;")), method4272(method4271("I \u001c\u000f*Tz\u0019\u0006 \u000fzA^")), method4272(method4271("\u0005zQ$n"))};
   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "I"
   )
   public static int field8353;
   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "I"
   )
   public static int field8354;
   @OriginalMember(
      owner = "client!lf",
      name = "e",
      descriptor = "I"
   )
   public static int field8356;
   @OriginalMember(
      owner = "client!lf",
      name = "d",
      descriptor = "I"
   )
   public static int field8357;
   @OriginalMember(
      owner = "client!lf",
      name = "c",
      descriptor = "I"
   )
   public static int field8358;
   @OriginalMember(
      owner = "client!lf",
      name = "f",
      descriptor = "Lhr;"
   )
   public static class244 field8355;

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4266(int arg0) {
      boolean var1 = client.field1481;

      try {
         label39: {
            if (class157.field2022 != 3) {
               if (~class157.field2022 == -8) {
                  class577.method4324((byte)-124, 8);
                  if (!var1) {
                     break label39;
                  }
               }

               if (~class157.field2022 != -10) {
                  if (class157.field2022 != 11) {
                     break label39;
                  }

                  class577.method4324((byte)-125, 12);
                  if (!var1) {
                     break label39;
                  }
               }

               class577.method4324((byte)-124, 10);
               if (!var1) {
                  break label39;
               }
            }

            class577.method4324((byte)-123, 4);
         }

         if (arg0 != 4) {
            method4267((byte)12, (byte)112);
         }

         ++field8354;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8359[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(BB)Z"
   )
   public static final boolean method4267(byte arg0, byte arg1) {
      try {
         if (arg1 != -24) {
            field8356 = -13;
         }

         ++field8358;
         int var2 = 255 & arg0;
         if (var2 == 0) {
            return false;
         } else {
            return var2 < 128 || ~var2 <= -161 || class497.field6956[var2 + -128] != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8359[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(ILid;)Ljava/lang/String;"
   )
   public static final String method4268(int arg0, class438 arg1) {
      try {
         if (arg0 >= -91) {
            field8355 = null;
         }

         ++field8353;
         return arg1.field5962 + field8359[6];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8359[7] + arg0 + ',' + (arg1 != null ? field8359[5] : field8359[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4269(boolean arg0) {
      try {
         field8355 = null;
         if (arg0) {
            field8356 = 56;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8359[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IIZ)B"
   )
   public static final byte method4270(int arg0, int arg1, boolean arg2) {
      try {
         ++field8357;
         if (~arg1 != -10) {
            return 0;
         } else if (arg2) {
            return -110;
         } else {
            return (byte)((arg0 & 1) == 0 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8359[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4271(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4272(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
