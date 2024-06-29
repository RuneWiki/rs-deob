import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class692 {
   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "[I"
   )
   private int[] field10161;
   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10164 = new String[]{method5050(method5049("'D\u001ba ")), method5050(method5049("*\u001a\u001bs42\u0003Aqu")), method5050(method5049("2\u001fY#")), method5050(method5049("*\u001a\u001b\u000eu"))};
   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "I"
   )
   public static int field10162;
   @OriginalMember(
      owner = "client!vp",
      name = "c",
      descriptor = "I"
   )
   public static int field10163;

   @OriginalMember(
      owner = "client!vp",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class692(int[] arg0) {
      boolean var2 = client.field1481;
      super();

      try {
         int var3 = 1;
         if (var2) {
            var3 <<= 1;
         }

         while(true) {
            while(var3 <= (arg0.length >> 1) + arg0.length) {
               var3 <<= 1;
            }

            this.field10161 = new int[var3 + var3];
            if (!var2) {
               int var4 = 0;
               if (var2) {
                  this.field10161[var4] = -1;
                  ++var4;
               }

               while(true) {
                  while(~(var3 + var3) < ~var4) {
                     this.field10161[var4] = -1;
                     ++var4;
                  }

                  int var5 = 0;
                  if (!var2) {
                     if (!var2 && ~arg0.length >= ~var5) {
                        return;
                     }

                     do {
                        int var6 = arg0[var5] & var3 + -1;
                        if (var2) {
                           var6 = var3 + -1 & var6 + 1;
                        }

                        while(this.field10161[var6 + 1 + var6] != -1) {
                           var6 = var3 + -1 & var6 + 1;
                        }

                        this.field10161[var6 + var6] = arg0[var5];
                        this.field10161[var6 - -var6 + 1] = var5++;
                     } while(~arg0.length < ~var5);

                     return;
                  }

                  ++var4;
               }
            }

            var3 = 0;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10164[1] + (arg0 != null ? field10164[0] : field10164[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method5048(int arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field10162;
         if (arg1 <= 23) {
            this.method5048(-15, (byte)-29);
         }

         int var4 = (this.field10161.length >> 1) + -1;
         int var5 = var4 & arg0;

         while(true) {
            int var6 = this.field10161[var5 - -var5 + 1];
            int var10000;
            if (~var6 == 0) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = this.field10161[var5 + var5];
            }

            if (var10000 == arg0) {
               return var6;
            }

            var5 = var4 & var5 - -1;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10164[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5049(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5050(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
