import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class546 extends class70 {
   @OriginalMember(
      owner = "client!kt",
      name = "O",
      descriptor = "I"
   )
   private int field8189 = 0;
   @OriginalMember(
      owner = "client!kt",
      name = "L",
      descriptor = "I"
   )
   private int field8191 = 4096;
   @OriginalMember(
      owner = "client!kt",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8196 = new String[]{method4158(method4157("flyui")), method4158(method4157("flyri")), method4158(method4157("flywi")), method4158(method4157("fly~i")), method4158(method4157("v6y\u0018<")), method4158(method4157("cm;Z")), method4158(method4157("fly|i"))};
   @OriginalMember(
      owner = "client!kt",
      name = "P",
      descriptor = "Lnaa;"
   )
   public static class113 field8192 = new class113(52, -1);
   @OriginalMember(
      owner = "client!kt",
      name = "N",
      descriptor = "I"
   )
   public static int field8186;
   @OriginalMember(
      owner = "client!kt",
      name = "F",
      descriptor = "I"
   )
   public static int field8187;
   @OriginalMember(
      owner = "client!kt",
      name = "M",
      descriptor = "I"
   )
   public static int field8188;
   @OriginalMember(
      owner = "client!kt",
      name = "J",
      descriptor = "I"
   )
   public static int field8190;
   @OriginalMember(
      owner = "client!kt",
      name = "K",
      descriptor = "I"
   )
   public static int field8195;
   @OriginalMember(
      owner = "client!kt",
      name = "G",
      descriptor = "Llaa;"
   )
   public static class541 field8194;
   @OriginalMember(
      owner = "client!kt",
      name = "I",
      descriptor = "Lha;"
   )
   public static class610 field8193;

   @OriginalMember(
      owner = "client!kt",
      name = "g",
      descriptor = "(I)V",
      line = 5
   )
   public static void method4155(int arg0) {
      try {
         field8194 = null;
         field8192 = null;
         field8193 = null;
         if (arg0 < 74) {
            field8192 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8196[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "<init>",
      descriptor = "()V",
      line = 123
   )
   public class546() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(BI)[I",
      line = 25
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8188;
         if (arg0 != 87) {
            field8195 = 124;
         }

         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int[] var5 = this.method545(0, arg1, (byte)-124);
            int var6 = 0;
            if (var3 || ~class678.field10127 < ~var6) {
               do {
                  int var7 = var5[var6];
                  if (var7 >= this.field8189) {
                     if (var7 <= this.field8191) {
                        var4[var6] = var7;
                        if (var3) {
                           var4[var6] = this.field8191;
                           if (var3) {
                              var4[var6] = this.field8189;
                              ++var6;
                           } else {
                              ++var6;
                           }
                        } else {
                           ++var6;
                        }
                     } else {
                        var4[var6] = this.field8191;
                        if (var3) {
                           var4[var6] = this.field8189;
                           ++var6;
                        } else {
                           ++var6;
                        }
                     }
                  } else {
                     var4[var6] = this.field8189;
                     ++var6;
                  }
               } while(~class678.field10127 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8196[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "b",
      descriptor = "(III)Z",
      line = 67
   )
   public static final boolean method4156(int arg0, int arg1, int arg2) {
      try {
         ++field8186;
         if (arg1 != -14112) {
            method4156(-53, 43, -38);
         }

         return (55 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8196[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(IILica;)V",
      line = 78
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label57: {
            label51: {
               label50: {
                  ++field8187;
                  if (arg1 != 0) {
                     if (arg1 == 1) {
                        break label50;
                     }

                     if (arg1 != 2) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field8189 = arg2.method2848(-105);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field8191 = arg2.method2848(arg0 ^ 109);
               if (!var4) {
                  break label57;
               }
            }

            super.field933 = arg2.method2855(-31007) == 1;
         }

         if (arg0 != -1) {
            this.method537(102, -70);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8196[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8196[4] : field8196[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(II)[[I",
      line = 126
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8190;
         if (arg0 != 32) {
            return null;
         } else {
            int[][] var4 = super.field918.method3276((byte)113, arg1);
            if (super.field918.field6361) {
               int[][] var5 = this.method539(true, arg1, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || class678.field10127 > var12) {
                  do {
                     int var14;
                     int var15;
                     label68: {
                        int var13 = var6[var12];
                        var14 = var7[var12];
                        var15 = var8[var12];
                        if (this.field8189 > var13) {
                           var9[var12] = this.field8189;
                           if (!var3) {
                              break label68;
                           }
                        }

                        if (this.field8191 >= var13) {
                           var9[var12] = var13;
                           if (var3) {
                              var9[var12] = this.field8191;
                           }
                        } else {
                           var9[var12] = this.field8191;
                        }
                     }

                     if (~var14 <= ~this.field8189) {
                        label72: {
                           if (~var14 < ~this.field8191) {
                              var10[var12] = this.field8191;
                              if (!var3) {
                                 break label72;
                              }
                           }

                           var10[var12] = var14;
                           if (var3) {
                              var10[var12] = this.field8189;
                           }
                        }
                     } else {
                        var10[var12] = this.field8189;
                     }

                     if (~this.field8189 < ~var15) {
                        var11[var12] = this.field8189;
                        if (!var3) {
                           ++var12;
                           continue;
                        }
                     }

                     if (~var15 >= ~this.field8191) {
                        var11[var12] = var15;
                        if (var3) {
                           var11[var12] = this.field8191;
                           ++var12;
                        } else {
                           ++var12;
                        }
                     } else {
                        var11[var12] = this.field8191;
                        ++var12;
                     }
                  } while(class678.field10127 > var12);
               }
            }

            return var4;
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8196[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
