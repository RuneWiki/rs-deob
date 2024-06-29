import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class682 extends class523 implements class485 {
   @OriginalMember(
      owner = "client!fk",
      name = "g",
      descriptor = "I"
   )
   private int field10041;
   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10044 = new String[]{method4976(method4975("2\f\n\u0016P:\u000eP\u0014\u0011")), method4976(method4975("/I\n\u0004D")), method4976(method4975(":\u0012HF")), method4976(method4975("2\f\nc\u0011")), method4976(method4975("2\f\nn\u0011")), method4976(method4975("2\f\n`\u0011")), method4976(method4975("2\f\ni\u0011")), method4976(method4975("2\f\nh\u0011"))};
   @OriginalMember(
      owner = "client!fk",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field10036 = false;
   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "I"
   )
   public static int field10037;
   @OriginalMember(
      owner = "client!fk",
      name = "j",
      descriptor = "I"
   )
   public static int field10038;
   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "I"
   )
   public static int field10039;
   @OriginalMember(
      owner = "client!fk",
      name = "h",
      descriptor = "I"
   )
   public static int field10040;
   @OriginalMember(
      owner = "client!fk",
      name = "f",
      descriptor = "I"
   )
   public static int field10042;
   @OriginalMember(
      owner = "client!fk",
      name = "e",
      descriptor = "I"
   )
   public static int field10043;

   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method3518(int arg0) {
      try {
         ++field10043;
         int var2 = -109 % ((arg0 - -28) / 38);
         return 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10044[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Lgl;Z)V",
      line = 17
   )
   public static final void method4973(class627 arg0, boolean arg1) {
      for(int var2 = arg0.field9207; var2 <= arg0.field9211; ++var2) {
         for(int var3 = arg0.field9208; var3 <= arg0.field9212; ++var3) {
            class517 var4 = class663.field9659[arg0.field10701][var2][var3];
            if (var4 != null) {
               class772 var5 = var4.field7468;
               class772 var6 = null;

               while(var5 != null) {
                  if (var5.field11352 == arg0) {
                     if (var6 != null) {
                        var6.field11354 = var5.field11354;
                     } else {
                        var4.field7468 = var5.field11354;
                     }

                     var5.method5577((byte)105);
                     break;
                  }

                  var6 = var5;
                  var5 = var5.field11354;
               }
            }
         }
      }

      if (!arg1) {
         class32.method286(arg0);
      }

   }

   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "(I)V",
      line = 63
   )
   public static final void method4974(int arg0) {
      try {
         ++field10040;
         if (class542.field7787 == arg0) {
            class542.field7787 = 11;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10044[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(II[BZ)V",
      line = 76
   )
   public final void method3519(int arg0, int arg1, byte[] arg2, boolean arg3) {
      try {
         this.method3795(arg2, arg0);
         ++field10037;
         this.field10041 = arg1;
         if (arg3) {
            this.field10041 = 60;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10044[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10044[1] : field10044[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Z)I",
      line = 89
   )
   public final int method3517(boolean arg0) {
      try {
         ++field10039;
         return !arg0 ? -123 : this.field10041;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10044[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "<init>",
      descriptor = "(Lea;I[BI)V",
      line = 104
   )
   public class682(class573 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field10041 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10044[0] + (arg0 != null ? field10044[1] : field10044[2]) + ',' + arg1 + ',' + (arg2 != null ? field10044[1] : field10044[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(I)J",
      line = 115
   )
   public final long method3516(int arg0) {
      try {
         if (arg0 <= 71) {
            return -2L;
         } else {
            ++field10038;
            return super.field7510.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10044[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "<init>",
      descriptor = "(Lea;ILjaclib/memory/Buffer;)V",
      line = 128
   )
   public class682(class573 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field10041 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10044[0] + (arg0 != null ? field10044[1] : field10044[2]) + ',' + arg1 + ',' + (arg2 != null ? field10044[1] : field10044[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4975(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4976(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
