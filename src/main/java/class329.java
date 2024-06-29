import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class329 extends class505 {
   @OriginalMember(
      owner = "client!kka",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4490 = new String[]{method2438(method2437("XmAt{\u001b")), method2438(method2437("H(\u000etG")), method2438(method2437("]sL6")), method2438(method2437("XmAtr\u001b")), method2438(method2437("XmAtp\u001b")), method2438(method2437("XmAts\u001b")), method2438(method2437("XmAt}\u001b"))};
   @OriginalMember(
      owner = "client!kka",
      name = "y",
      descriptor = "B"
   )
   private byte field4483;
   @OriginalMember(
      owner = "client!kka",
      name = "s",
      descriptor = "B"
   )
   private byte field4488;
   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "I"
   )
   public static int field4482;
   @OriginalMember(
      owner = "client!kka",
      name = "u",
      descriptor = "I"
   )
   public static int field4484;
   @OriginalMember(
      owner = "client!kka",
      name = "w",
      descriptor = "I"
   )
   public static int field4485;
   @OriginalMember(
      owner = "client!kka",
      name = "x",
      descriptor = "I"
   )
   public static int field4486;
   @OriginalMember(
      owner = "client!kka",
      name = "t",
      descriptor = "I"
   )
   public static int field4487;
   @OriginalMember(
      owner = "client!kka",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   private String field4489;

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(BII)Z",
      line = 3
   )
   public static final boolean method2434(byte arg0, int arg1, int arg2) {
      try {
         ++field4482;
         return arg0 >= -126 ? true : class679.method4962(arg1, -24190, arg2) & (~(arg1 & 8192) != -1 | class172.method1400(arg1, 21923, arg2) | class83.method744(arg2, arg1, -17694));
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4490[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(Ldda;Z)V",
      line = 14
   )
   public final void method1339(class405 arg0, boolean arg1) {
      try {
         ++field4485;
         if (this.field4489 != null) {
            arg0.field5849 = this.field4488;
            arg0.field5852 = this.field4483;
         }

         arg0.field5838 = this.field4489;
         if (!arg1) {
            this.field4488 = 106;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4490[0] + (arg0 != null ? field4490[1] : field4490[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "([BIFFFIIIIFLrw;BIF)V",
      line = 33
   )
   public static final void method2435(byte[] param0, int param1, float param2, float param3, float param4, int param5, int param6, int param7, int param8, float param9, class791 param10, byte param11, int param12, float param13) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(Z)V",
      line = 84
   )
   public static final void method2436(boolean arg0) {
      try {
         ++field4484;
         if (!arg0) {
            class328.field4478.method5067(-12072);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4490[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 107
   )
   public final void method1338(int arg0, class147 arg1) {
      try {
         this.field4489 = arg1.method1175(6781);
         if (arg0 > 105) {
            ++field4487;
            if (this.field4489 != null) {
               arg1.method1143(-15465);
               this.field4483 = arg1.method1162(4);
               this.field4488 = arg1.method1162(4);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4490[6] + arg0 + ',' + (arg1 != null ? field4490[1] : field4490[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2437(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2438(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
