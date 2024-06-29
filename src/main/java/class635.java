import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class635 extends class664 implements class723 {
   @OriginalMember(
      owner = "client!kba",
      name = "q",
      descriptor = "I"
   )
   private int field8998;
   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9005 = new String[]{method4644(method4643("\u0019/2Y4Z")), method4644(method4643("\u0019/2Y7Z")), method4644(method4643("\u0019/2Y8Z")), method4644(method4643("\u0019/2Y2Z")), method4644(method4643("\u0019/2Y5Z")), method4644(method4643("\u0019/2YL\u001b#:\u0003NZ")), method4644(method4643("\tc}Y\r")), method4644(method4643("\u001c8?\u001b")), method4644(method4643("\u0019/2Y6Z")), method4644(method4643("\u0019/2Y3Z"))};
   @OriginalMember(
      owner = "client!kba",
      name = "r",
      descriptor = "I"
   )
   public static int field8999 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "p",
      descriptor = "Lpl;"
   )
   public static class168 field8997 = new class168();
   @OriginalMember(
      owner = "client!kba",
      name = "o",
      descriptor = "J"
   )
   public static long field9003 = 0L;
   @OriginalMember(
      owner = "client!kba",
      name = "u",
      descriptor = "I"
   )
   public static int field8994;
   @OriginalMember(
      owner = "client!kba",
      name = "w",
      descriptor = "I"
   )
   public static int field8995;
   @OriginalMember(
      owner = "client!kba",
      name = "x",
      descriptor = "I"
   )
   public static int field8996;
   @OriginalMember(
      owner = "client!kba",
      name = "s",
      descriptor = "I"
   )
   public static int field9000;
   @OriginalMember(
      owner = "client!kba",
      name = "t",
      descriptor = "I"
   )
   public static int field9001;
   @OriginalMember(
      owner = "client!kba",
      name = "n",
      descriptor = "I"
   )
   public static int field9002;
   @OriginalMember(
      owner = "client!kba",
      name = "v",
      descriptor = "I"
   )
   public static int field9004;

   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method995(int arg0) {
      try {
         ++field8994;
         if (arg0 >= -8) {
            this.method992(-96);
         }

         return super.field9358;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9005[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method996(int arg0, byte[] arg1, int arg2, int arg3) {
      try {
         this.method4829(1, arg3, arg1);
         ++field9002;
         if (arg2 < -16) {
            this.field8998 = arg0;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9005[8] + arg0 + ',' + (arg1 != null ? field9005[6] : field9005[7]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4641(int arg0) {
      try {
         if (arg0 < 80) {
            field9003 = -80L;
         }

         field8997 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9005[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "(Laea;I[BIZ)V"
   )
   public class635(class678 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field8998 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9005[5] + (arg0 != null ? field9005[6] : field9005[7]) + ',' + arg1 + ',' + (arg2 != null ? field9005[6] : field9005[7]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2084(byte arg0) {
      try {
         if (arg0 != 17) {
            field9003 = -33L;
         }

         ++field9001;
         super.field9357.method4892(this, (byte)-21);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9005[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4642(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method992(int arg0) {
      try {
         ++field9004;
         if (arg0 != 16161) {
            this.method993((byte)-58);
         }

         return 0L;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9005[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method993(byte arg0) {
      try {
         if (arg0 != 116) {
            this.method2084((byte)52);
         }

         ++field8996;
         return this.field8998;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9005[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4643(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4644(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
