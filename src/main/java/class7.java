import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {
   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "B"
   )
   public byte field74;
   @OriginalMember(
      owner = "client!il",
      name = "f",
      descriptor = "B"
   )
   public byte field73;
   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "S"
   )
   public short field77;
   @OriginalMember(
      owner = "client!il",
      name = "d",
      descriptor = "Lwr;"
   )
   public class485 field72;
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field78 = new String[]{method38(method37("$\u001e\u0019\u0002a")), method38(method37("#\u0007[,")), method38(method37("$\u001e\u0019| #\u001bC~a")), method38(method37("6\\\u0019n4")), method38(method37("a\u001d")), method38(method37("b\u001e\n")), method38(method37("a\u0013\u0005")), method38(method37("%\u0006C0sb]")), method38(method37("b\u0013\n")), method38(method37("\u0012\u0001R,/")), method38(method37("b\u0002\n")), method38(method37("$\u001e\u0019\u0001a")), method38(method37("b\u0018"))};
   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "I"
   )
   public static int field75;
   @OriginalMember(
      owner = "client!il",
      name = "e",
      descriptor = "I"
   )
   public static int field76;

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method35(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(IILjava/lang/String;)Z"
   )
   public static final boolean method36(int arg0, int arg1, String arg2) {
      boolean var3 = client.field4360;

      try {
         ++field75;
         if (class316.field4304.field9134) {
            class526.field7533 = new class431();
            class526.field7533.field6161 = arg2;
            class526.field7533.field6156 = arg0;
            if (class435.field6230 != class290.field4016) {
               class526.field7533.field6158 = class526.field7533.field6156 + 50000;
               class526.field7533.field6163 = class526.field7533.field6156 + 40000;
            }

            int var4 = 0;
            if (var3) {
               if (~class316.field4305[var4].field7304 == ~arg0) {
                  class212.field3032 = class316.field4305[var4].field2314;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (~var4 <= ~class316.field4305.length) {
                  var10000 = 1;
                  if (!var3) {
                     return true;
                  }
               } else {
                  var10000 = ~class316.field4305[var4].field7304;
               }

               if (var10000 == ~arg0) {
                  class212.field3032 = class316.field4305[var4].field2314;
               }

               ++var4;
            }
         } else {
            String var5 = "";
            if (class435.field6230 != class290.field4016) {
               var5 = ":" + (arg0 + 7000);
            }

            int var6 = 75 / ((arg1 - 10) / 48);
            String var7 = "";
            if (class612.field8975 != null) {
               var7 = field78[10] + class612.field8975;
            }

            String var8 = field78[7] + arg2 + var5 + field78[5] + class608.field8920 + field78[8] + class564.field8049 + var7 + field78[12] + (!class435.field6231 ? "0" : "1") + field78[4] + (!class291.field4025 ? "0" : "1") + field78[6];

            try {
               class220.field3148.getAppletContext().showDocument(new URL(var8), field78[9]);
               return true;
            } catch (Exception var10) {
               return false;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field78[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field78[3] : field78[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "<init>",
      descriptor = "(Lwr;III)V"
   )
   public class7(class485 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field74 = (byte)arg2;
         this.field73 = (byte)arg3;
         this.field77 = (short)arg1;
         this.field72 = arg0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field78[2] + (arg0 != null ? field78[3] : field78[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method37(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method38(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
