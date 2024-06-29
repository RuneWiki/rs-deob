import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class518 extends class690 {
   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7114 = new String[]{method3760(method3759("\ntse")), method3760(method3759("\u000fq1Lz")), method3760(method3759("\u001f/1'/")), method3760(method3759("\u000fq1Hz")), method3760(method3759("\u000fq1Mz")), method3760(method3759("\u000fq1Jz")), method3760(method3759("\u000fq1Kz"))};
   @OriginalMember(
      owner = "client!kp",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field7105 = new int[25];
   @OriginalMember(
      owner = "client!kp",
      name = "r",
      descriptor = "B"
   )
   private byte field7103;
   @OriginalMember(
      owner = "client!kp",
      name = "n",
      descriptor = "B"
   )
   private byte field7104;
   @OriginalMember(
      owner = "client!kp",
      name = "o",
      descriptor = "B"
   )
   private byte field7107;
   @OriginalMember(
      owner = "client!kp",
      name = "w",
      descriptor = "B"
   )
   private byte field7110;
   @OriginalMember(
      owner = "client!kp",
      name = "q",
      descriptor = "I"
   )
   public static int field7106;
   @OriginalMember(
      owner = "client!kp",
      name = "t",
      descriptor = "I"
   )
   public static int field7108;
   @OriginalMember(
      owner = "client!kp",
      name = "u",
      descriptor = "I"
   )
   public static int field7111;
   @OriginalMember(
      owner = "client!kp",
      name = "m",
      descriptor = "I"
   )
   public static int field7113;
   @OriginalMember(
      owner = "client!kp",
      name = "p",
      descriptor = "Z"
   )
   private boolean field7109;
   @OriginalMember(
      owner = "client!kp",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field7112;

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(Ldn;Ldn;I)V"
   )
   public static final void method3756(class546 arg0, class546 arg1, int arg2) {
      try {
         if (arg0.field7451 != null) {
            arg0.method3943(-4);
         }

         ++field7111;
         arg0.field7453 = arg1;
         if (arg2 != 1) {
            method3758(114);
         }

         arg0.field7451 = arg1.field7451;
         arg0.field7451.field7453 = arg0;
         arg0.field7453.field7451 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7114[1] + (arg0 != null ? field7114[2] : field7114[0]) + ',' + (arg1 != null ? field7114[2] : field7114[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         arg1.field1844 = this.field7107;
         arg1.field1814 = this.field7104;
         arg1.field1842 = this.field7110;
         if (arg0) {
            method3757((byte)-53, -18, 2);
         }

         arg1.field1839 = this.field7109;
         ++field7106;
         arg1.field1836 = this.field7103;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7114[5] + arg0 + ',' + (arg1 != null ? field7114[2] : field7114[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method3757(byte arg0, int arg1, int arg2) {
      try {
         ++field7113;
         class446 var3 = class635.method4607(arg0 ^ -16, (long)arg2, 1);
         var3.method3311(true);
         if (arg0 != -97) {
            field7112 = false;
         }

         var3.field6167 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7114[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3758(int arg0) {
      try {
         field7105 = null;
         if (arg0 != 4) {
            field7105 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7114[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         this.field7109 = arg0.method4288((byte)120) == 1;
         if (arg1 > -19) {
            this.field7109 = true;
         }

         ++field7108;
         this.field7107 = arg0.method4340(409855200);
         this.field7103 = arg0.method4340(409855200);
         this.field7104 = arg0.method4340(409855200);
         this.field7110 = arg0.method4340(409855200);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7114[4] + (arg0 != null ? field7114[2] : field7114[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3759(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3760(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
