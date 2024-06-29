import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public abstract class class54 {
   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field622 = new String[]{method431(method430("Po?-i\u001f")), method431(method430("Po?-m\u001f")), method431(method430("Po?-n\u001f")), method431(method430("Po?-f\u001f")), method431(method430("Po?-c\u001f"))};
   @OriginalMember(
      owner = "client!gja",
      name = "d",
      descriptor = "I"
   )
   public static int field617 = 0;
   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "I"
   )
   public static int field615;
   @OriginalMember(
      owner = "client!gja",
      name = "f",
      descriptor = "I"
   )
   public static int field618;
   @OriginalMember(
      owner = "client!gja",
      name = "e",
      descriptor = "I"
   )
   public static int field619;
   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "I"
   )
   public static int field621;
   @OriginalMember(
      owner = "client!gja",
      name = "g",
      descriptor = "Lta;"
   )
   public static class222 field616;
   @OriginalMember(
      owner = "client!gja",
      name = "c",
      descriptor = "Leaa;"
   )
   public static class526 field620;

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method425(int arg0) {
      try {
         field616 = null;
         if (arg0 == 1) {
            field620 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field622[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(B)V",
      line = 14
   )
   public static final void method426(byte arg0) {
      int var1 = client.field4530;

      try {
         label28: {
            ++field615;
            if (class402.field6179 == null) {
               if (class752.field11122 == -1) {
                  class670.method4875(class685.field10283, class149.field1859, (byte)117, class397.field6109);
                  if (var1 == 0) {
                     break label28;
                  }
               }

               class709.method5139(class149.field1859, false);
               if (var1 == 0) {
                  break label28;
               }
            }

            class275.method2120(class149.field1859, (byte)126);
         }

         if (arg0 != 21) {
            method428(false, (byte)-59);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field622[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(IIIIZII)V",
      line = 33
   )
   public static final void method427(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
      try {
         label35: {
            if (class197.field2442 > -arg0 + arg1 || ~(arg1 - -arg0) < ~class100.field1232 || class506.field7472 > -arg0 + arg2 || ~class22.field234 > ~(arg0 + arg2)) {
               class685.method4978(arg2, arg3, arg1, 3765, arg5, arg6, arg0);
               if (client.field4530 == 0) {
                  break label35;
               }
            }

            class78.method745(arg2, arg3, -747159327, arg0, arg6, arg1, arg5);
         }

         if (arg4) {
            ++field619;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field622[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(ZB)V",
      line = 64
   )
   public static final void method428(boolean arg0, byte arg1) {
      try {
         if (arg1 > -28) {
            field620 = null;
         }

         ++field621;
         class280.field3897.method1513(class616.field9011.method656());
         int[] var2 = class616.field9011.method576();
         class145.field1826 = var2[2];
         class778.field11363 = var2[0];
         class351.field5334 = var2[1];
         class489.field7232 = var2[3];
         if (arg0) {
            class616.field9011.method630(class728.field10818, class310.field4416, class723.field10762, class226.field2904);
            class262.method1991((byte)-96, class134.field1670);
         } else {
            class616.field9011.method630(class188.field2350, class454.field6898, class346.field5267, class408.field6222);
            class262.method1991((byte)-96, class307.field4369);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field622[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "e",
      descriptor = "(I)Z",
      line = 96
   )
   public final boolean method429(int arg0) {
      try {
         if (arg0 != -1) {
            field617 = -3;
         }

         ++field618;
         return this.method379(3) || this.method369((byte)-127) || this.method377((byte)-72);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field622[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method379(int arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method377(byte arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "d",
      descriptor = "(I)Lbn;"
   )
   public abstract class467 method375(int arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method376(int arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "e",
      descriptor = "(B)Z"
   )
   public abstract boolean method369(byte arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "(B)I"
   )
   public abstract int method368(byte arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "d",
      descriptor = "(B)V"
   )
   public abstract void method374(byte arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method366(boolean arg0);

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method430(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method431(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
