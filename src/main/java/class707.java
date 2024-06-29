import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class707 {
   @OriginalMember(
      owner = "client!ee",
      name = "g",
      descriptor = "Lpja;"
   )
   public class42 field10257;
   @OriginalMember(
      owner = "client!ee",
      name = "d",
      descriptor = "Lpja;"
   )
   public class42 field10260;
   @OriginalMember(
      owner = "client!ee",
      name = "j",
      descriptor = "Lpja;"
   )
   public class42 field10261;
   @OriginalMember(
      owner = "client!ee",
      name = "h",
      descriptor = "[Lmj;"
   )
   public class684[] field10263;
   @OriginalMember(
      owner = "client!ee",
      name = "b",
      descriptor = "[Lmj;"
   )
   public class684[] field10259;
   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "Z"
   )
   public boolean field10264;
   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10265 = new String[]{method5147(method5146("V'C\u0018\b]+\u0019\u001aI")), method5147(method5146("]7\u0001H")), method5147(method5146("HlC\n\u001c")), method5147(method5146("V'C`I")), method5147(method5146("V'CeI")), method5147(method5146("V'CfI")), method5147(method5146("V'CgI"))};
   @OriginalMember(
      owner = "client!ee",
      name = "e",
      descriptor = "I"
   )
   public static int field10255;
   @OriginalMember(
      owner = "client!ee",
      name = "f",
      descriptor = "I"
   )
   public static int field10256;
   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "I"
   )
   public static int field10258;
   @OriginalMember(
      owner = "client!ee",
      name = "i",
      descriptor = "I"
   )
   public static int field10262;

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(IIZIIII)Ltba;"
   )
   public static final class172 method5142(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field10256;
         long var7 = (long)arg0 * 475427L ^ (long)arg4 * 97549L ^ (long)arg1 * 67481L ^ (long)arg5 * 986053L ^ (long)arg3 * 32147369L ^ (long)arg6 * 76724863L;
         class172 var9 = (class172)class558.field7654.method4239(var7, 0);
         if (var9 != null) {
            return var9;
         } else if (!arg2) {
            return null;
         } else {
            class172 var10 = class252.field3198.method514(arg1, arg4, arg0, arg5, arg3, arg6);
            class558.field7654.method4238(57, var10, var7);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field10265[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5143(byte arg0) {
      try {
         class252.field3198.method557((0.1F * (float)class674.field9907.field8452.method844((byte)-87) + 0.7F) * 1.1523438F);
         ++field10258;
         class252.field3198.method509(class510.field7061, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
         class252.field3198.method547(class73.field899, -1, 0);
         if (arg0 < -64) {
            class252.field3198.method556(class233.field2892);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10265[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method5144(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 > -112) {
            method5143((byte)-17);
         }

         ++field10255;
         return class418.method3165(arg2, arg1, (byte)52) & class671.method4919((byte)83, arg1, arg2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10265[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(BLqf;II)J"
   )
   public static final long method5145(byte arg0, class712 arg1, int arg2, int arg3) {
      try {
         ++field10262;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         class774 var8 = class472.field6533.method3586(arg0 ^ -40, arg1.method2281((byte)-127));
         if (arg0 != -104) {
            return 50L;
         } else {
            long var9 = (long)(arg2 << 7 | arg3 | arg1.method2273((byte)66) << 14 | arg1.method2280(-31276) << 20 | 1073741824);
            if (var8.field11227 == 0) {
               var9 |= var6;
            }

            if (var8.field11232 == 1) {
               var9 |= var4;
            }

            return var9 | (long)arg1.method2281((byte)-127) << 32;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field10265[4] + arg0 + ',' + (arg1 != null ? field10265[2] : field10265[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class707(class670 arg0) {
      boolean var2 = client.field4273;
      super();
      this.field10257 = null;
      this.field10260 = null;
      this.field10261 = null;
      this.field10263 = null;
      this.field10259 = null;

      try {
         this.field10264 = arg0.field9770;
         class191.method1439(116, arg0);
         if (!this.field10264) {
            Object var10000;
            byte var10001;
            label52: {
               this.field10259 = new class684[16];
               int var3 = 0;
               if (var2) {
                  var10000 = class617.field8603;
                  var10001 = -69;
               } else if (~var3 <= -17) {
                  var10000 = this;
                  var10001 = 16;
                  if (!var2) {
                     break label52;
                  }
               } else {
                  var10000 = class617.field8603;
                  var10001 = -69;
               }

               while(true) {
                  byte[] var4 = class718.method5221(var10000, var10001, var3 * 128 * 256, 32768);
                  this.field10259[var3] = new class684(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
                  ++var3;
                  if (~var3 <= -17) {
                     var10000 = this;
                     var10001 = 16;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = class617.field8603;
                     var10001 = -69;
                  }
               }
            }

            ((class707)var10000).field10263 = new class684[var10001];
            int var5 = 0;
            if (var2 || ~var5 > -17) {
               do {
                  byte[] var6 = class718.method5221(class605.field8433, (byte)-69, var5 * 2 * 16384, 32768);
                  this.field10263[var5] = new class684(arg0, 3553, 6410, 128, 128, true, var6, 6410, false);
                  ++var5;
               } while(~var5 > -17);

            }
         } else {
            byte[] var7 = class324.method2442(class617.field8603, -42, false);
            this.field10261 = new class42(arg0, 6410, 128, 128, 16, var7, 6410);
            byte[] var8 = class324.method2442(class605.field8433, 123, false);
            this.field10260 = new class42(arg0, 6410, 128, 128, 16, var8, 6410);
            class762 var9 = arg0.field9713;
            if (var9.method5473(false)) {
               class42 var11;
               label68: {
                  byte[] var10 = class324.method2442(class59.field620, 124, false);
                  this.field10257 = new class42(arg0, 6408, 128, 128, 16);
                  var11 = new class42(arg0, 6409, 128, 128, 16, var10, 6409);
                  if (!var9.method5471(var11, this.field10257, 2.0F, (byte)-119)) {
                     this.field10257.method4124((byte)124);
                     this.field10257 = null;
                     if (!var2) {
                        break label68;
                     }
                  }

                  this.field10257.method4125((byte)114);
               }

               var11.method4124((byte)125);
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field10265[0] + (arg0 != null ? field10265[2] : field10265[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5146(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5147(char[] arg0) {
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
            var10005 = 66;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
