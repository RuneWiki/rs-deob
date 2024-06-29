import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class313 extends class533 {
   @OriginalMember(
      owner = "client!vfa",
      name = "g",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field4705;
   @OriginalMember(
      owner = "client!vfa",
      name = "m",
      descriptor = "Lfh;"
   )
   private class208 field4699;
   @OriginalMember(
      owner = "client!vfa",
      name = "p",
      descriptor = "Lvm;"
   )
   private class778 field4693;
   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4709 = new String[]{method2556(method2555("28B\u0019\u0019l")), method2556(method2555("28B\u00199-0B[6>;\u000b")), method2556(method2555("*+O[")), method2556(method2555("?p\r\u0019\"")), method2556(method2555("28B\u0019c-0JCal")), method2556(method2555("28B\u0019\u001dl")), method2556(method2555("28B\u0019\u001bl")), method2556(method2555("28B\u0019\u001el")), method2556(method2555("28B\u0019\u001cl")), method2556(method2555("28B\u0019\u001al"))};
   @OriginalMember(
      owner = "client!vfa",
      name = "s",
      descriptor = "Ltb;"
   )
   public static class392 field4696 = new class392(method2556(method2555("#?NRk")), method2556(method2555("\u0003?NR\u007fp")), 3);
   @OriginalMember(
      owner = "client!vfa",
      name = "v",
      descriptor = "I"
   )
   public static int field4706 = 500;
   @OriginalMember(
      owner = "client!vfa",
      name = "k",
      descriptor = "I"
   )
   public static int field4692;
   @OriginalMember(
      owner = "client!vfa",
      name = "j",
      descriptor = "I"
   )
   public static int field4694;
   @OriginalMember(
      owner = "client!vfa",
      name = "u",
      descriptor = "I"
   )
   public static int field4695;
   @OriginalMember(
      owner = "client!vfa",
      name = "r",
      descriptor = "I"
   )
   public static int field4697;
   @OriginalMember(
      owner = "client!vfa",
      name = "t",
      descriptor = "I"
   )
   public static int field4698;
   @OriginalMember(
      owner = "client!vfa",
      name = "w",
      descriptor = "I"
   )
   public static int field4700;
   @OriginalMember(
      owner = "client!vfa",
      name = "i",
      descriptor = "I"
   )
   public static int field4701;
   @OriginalMember(
      owner = "client!vfa",
      name = "n",
      descriptor = "I"
   )
   public static int field4702;
   @OriginalMember(
      owner = "client!vfa",
      name = "o",
      descriptor = "I"
   )
   public static int field4704;
   @OriginalMember(
      owner = "client!vfa",
      name = "l",
      descriptor = "I"
   )
   public static int field4707;
   @OriginalMember(
      owner = "client!vfa",
      name = "h",
      descriptor = "I"
   )
   public static int field4708;
   @OriginalMember(
      owner = "client!vfa",
      name = "q",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4703;

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method2549(int arg0, int arg1) throws IOException {
      try {
         if (arg1 != 29842) {
            return false;
         } else {
            ++field4702;
            return this.field4699.method1797(arg0, (byte)45);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4709[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2550(int arg0) {
      try {
         ++field4695;
         this.field4699.method1798((byte)91);
         this.field4693.method5619((byte)65);
         if (arg0 != 0) {
            this.method2554(true);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4709[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(III[B)I"
   )
   public final int method2551(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         ++field4694;
         if (arg1 < 80) {
            field4703 = null;
         }

         return this.field4699.method1799(arg3, arg2, false, arg0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4709[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4709[3] : field4709[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         this.method2554(false);
         ++field4700;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4709[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2552(int arg0) {
      try {
         field4696 = null;
         field4703 = null;
         if (arg0 >= -93) {
            method2552(49);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4709[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "(III[B)V"
   )
   public final void method2553(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         ++field4698;
         if (arg2 != 0) {
            method2552(43);
         }

         this.field4693.method5624((byte)115, arg0, arg3, arg1);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4709[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4709[3] : field4709[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2554(boolean arg0) {
      try {
         ++field4692;

         try {
            this.field4705.close();
         } catch (IOException var3) {
         }

         this.field4699.method1800(arg0);
         this.field4693.method5618(0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4709[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V"
   )
   public class313(Socket arg0, int arg1) throws IOException {
      try {
         this.field4705 = arg0;
         this.field4705.setSoTimeout(30000);
         this.field4705.setTcpNoDelay(true);
         this.field4699 = new class208(this.field4705.getInputStream(), arg1);
         this.field4693 = new class778(this.field4705.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4709[4] + (arg0 != null ? field4709[3] : field4709[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2555(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2556(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
