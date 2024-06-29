import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class585 {
   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8207 = new String[]{method4300(method4299("5c<\"")), method4300(method4299(">z~\r\u001f")), method4300(method4299(" 8~`J")), method4300(method4299(">z~\u000f\u001f")), method4300(method4299(">z~\f\u001f"))};
   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "I"
   )
   public static int field8203 = -1;
   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "Lef;"
   )
   public static class171 field8206 = new class171();
   @OriginalMember(
      owner = "client!el",
      name = "c",
      descriptor = "I"
   )
   public static int field8204;
   @OriginalMember(
      owner = "client!el",
      name = "d",
      descriptor = "I"
   )
   public static int field8205;

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(ILsa;Lsa;Z)V"
   )
   public static final void method4296(int arg0, class39 arg1, class39 arg2, boolean arg3) {
      try {
         class739.field10547 = arg2;
         class625.field8928 = arg1;
         if (arg3) {
            ++field8204;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8207[1] + arg0 + ',' + (arg1 != null ? field8207[2] : field8207[0]) + ',' + (arg2 != null ? field8207[2] : field8207[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4297(boolean arg0) {
      try {
         field8206 = null;
         if (arg0) {
            field8203 = 72;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8207[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(BLcu;)V"
   )
   public static final void method4298(byte arg0, class65 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8205;
         if (arg0 != 65) {
            method4297(false);
         }

         int var3 = arg1.method682(-125);
         class592.field8363 = new class183[var3];
         int var4 = 0;
         if (var2) {
            class592.field8363[var4] = new class183();
            class592.field8363[var4].field2684 = arg1.method682(arg0 + -161);
            class592.field8363[var4].field2688 = arg1.method698((byte)76);
            ++var4;
         }

         while(true) {
            while(~var3 < ~var4) {
               class592.field8363[var4] = new class183();
               class592.field8363[var4].field2684 = arg1.method682(arg0 + -161);
               class592.field8363[var4].field2688 = arg1.method698((byte)76);
               ++var4;
            }

            class7.field134 = arg1.method682(-57);
            class367.field5428 = arg1.method682(-90);
            class477.field6875 = arg1.method682(arg0 ^ -11);
            class492.field7017 = new class639[-class7.field134 + class367.field5428 + 1];
            int var5 = 0;
            if (!var2) {
               int var10000;
               if (var2) {
                  var10000 = arg1.method682(arg0 + -131);
               } else if (var5 >= class477.field6875) {
                  class36.field530 = arg1.method701(arg0 ^ 190);
                  var10000 = 1;
                  if (!var2) {
                     class695.field10045 = true;
                     return;
                  }
               } else {
                  var10000 = arg1.method682(arg0 + -131);
               }

               while(true) {
                  int var6 = var10000;
                  class639 var7 = class492.field7017[var6] = new class639();
                  var7.field11519 = arg1.method665(false);
                  var7.field11518 = arg1.method701(255);
                  var7.field9023 = class7.field134 + var6;
                  var7.field9018 = arg1.method698((byte)80);
                  var7.field9024 = arg1.method698((byte)112);
                  ++var5;
                  if (var5 >= class477.field6875) {
                     class36.field530 = arg1.method701(arg0 ^ 190);
                     var10000 = 1;
                     if (!var2) {
                        class695.field10045 = true;
                        return;
                     }
                  } else {
                     var10000 = arg1.method682(arg0 + -131);
                  }
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8207[3] + arg0 + ',' + (arg1 != null ? field8207[2] : field8207[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4299(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4300(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
