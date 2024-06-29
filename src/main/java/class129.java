import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class129 {
   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2161 = new String[]{method1247(method1246(":'2\\^")), method1247(method1246("+c20\u000b")), method1247(method1246("/|p\u001e")), method1247(method1246("+c23\u000b"))};
   @OriginalMember(
      owner = "client!jj",
      name = "g",
      descriptor = "B"
   )
   public byte field2154;
   @OriginalMember(
      owner = "client!jj",
      name = "f",
      descriptor = "I"
   )
   public int field2156;
   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "I"
   )
   public static int field2157;
   @OriginalMember(
      owner = "client!jj",
      name = "e",
      descriptor = "Lsm;"
   )
   public static class297 field2160;
   @OriginalMember(
      owner = "client!jj",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field2153;
   @OriginalMember(
      owner = "client!jj",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field2155;
   @OriginalMember(
      owner = "client!jj",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field2158;
   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field2159;

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1244(byte arg0) {
      try {
         if (arg0 < -66) {
            field2160 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2161[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(ILoo;Ljava/awt/Frame;)V"
   )
   public static final void method1245(int arg0, class651 arg1, Frame arg2) {
      boolean var3 = client.field4564;

      try {
         ++field2157;
         if (arg0 != -1) {
            method1244((byte)92);
         }

         label51:
         do {
            class789 var4 = arg1.method4774(0, arg2);
            if (var3) {
               class624.method4569((byte)98, 10L);
            }

            while(true) {
               int var10000;
               if (~var4.field11542 != -1) {
                  var10000 = var4.field11542;
                  if (!var3) {
                     if (var10000 == 1) {
                        break label51;
                     }

                     class624.method4569((byte)98, 100L);
                     break;
                  }
               } else {
                  var10000 = 98;
               }

               class624.method4569((byte)var10000, 10L);
            }
         } while(!var3);

         arg2.setVisible(false);
         arg2.dispose();
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2161[1] + arg0 + ',' + (arg1 != null ? field2161[0] : field2161[2]) + ',' + (arg2 != null ? field2161[0] : field2161[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1246(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1247(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
