package deob;

@ObfuscatedName("ASFXKKJM")
public class ASFXKKJM {

	@ObfuscatedName("ASFXKKJM.h")
	public int field9 = 0;

	@ObfuscatedName("ASFXKKJM.i")
	public int field10 = 0;

	@ObfuscatedName("ASFXKKJM.j")
	public int field11;

	@ObfuscatedName("ASFXKKJM.k")
	public int field12;

	@ObfuscatedName("ASFXKKJM.l")
	public int[][] field13;

	public ASFXKKJM(int arg0, int arg1) {
		field11 = arg0;
		field12 = arg1;
		field13 = new int[field11][field12];
		method5();
	}

	@ObfuscatedName("ASFXKKJM.a()V")
	public void method5() {
		for (int var1 = 0; var1 < field11; var1++) {
			for (int var2 = 0; var2 < field12; var2++) {
				if (var1 == 0 || var2 == 0 || field11 - 1 == var1 || field12 - 1 == var2) {
					field13[var1][var2] = 0xFFFFFF;
				} else {
					field13[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("ASFXKKJM.a(IIZIII)V")
	public void method6(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field9;
		arg0 -= field10;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method9(arg3, arg0, 128);
				method9(arg3 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method9(arg3, arg0, 2);
				method9(arg3, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method9(arg3, arg0, 8);
				method9(arg3 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method9(arg3, arg0, 32);
				method9(arg3, arg0 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method9(arg3, arg0, 1);
				method9(arg3 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method9(arg3, arg0, 4);
				method9(arg3 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method9(arg3, arg0, 16);
				method9(arg3 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method9(arg3, arg0, 64);
				method9(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method9(arg3, arg0, 130);
				method9(arg3 - 1, arg0, 8);
				method9(arg3, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method9(arg3, arg0, 10);
				method9(arg3, arg0 + 1, 32);
				method9(arg3 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method9(arg3, arg0, 40);
				method9(arg3 + 1, arg0, 128);
				method9(arg3, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method9(arg3, arg0, 160);
				method9(arg3, arg0 - 1, 2);
				method9(arg3 - 1, arg0, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method9(arg3, arg0, 0x10000);
					method9(arg3 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method9(arg3, arg0, 1024);
					method9(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method9(arg3, arg0, 4096);
					method9(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method9(arg3, arg0, 16384);
					method9(arg3, arg0 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method9(arg3, arg0, 512);
					method9(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method9(arg3, arg0, 2048);
					method9(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method9(arg3, arg0, 8192);
					method9(arg3 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method9(arg3, arg0, 32768);
					method9(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method9(arg3, arg0, 66560);
					method9(arg3 - 1, arg0, 4096);
					method9(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method9(arg3, arg0, 5120);
					method9(arg3, arg0 + 1, 16384);
					method9(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method9(arg3, arg0, 20480);
					method9(arg3 + 1, arg0, 0x10000);
					method9(arg3, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method9(arg3, arg0, 81920);
					method9(arg3, arg0 - 1, 1024);
					method9(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ASFXKKJM.a(IIIBZII)V")
	public void method7(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= field9;
		arg0 -= field10;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg5;
			arg5 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field11) {
				for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field12) {
						method9(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ASFXKKJM.a(IIZ)V")
	public void method8(int arg0, int arg1) {
		arg0 -= field9;
		arg1 -= field10;
		field13[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ASFXKKJM.a(III)V")
	public void method9(int arg0, int arg1, int arg2) {
		field13[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ASFXKKJM.a(IIZIZI)V")
	public void method10(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field9;
		arg0 -= field10;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method12(arg3, arg0, 128);
				method12(arg3 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method12(arg3, arg0, 2);
				method12(arg3, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method12(arg3, arg0, 8);
				method12(arg3 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method12(arg3, arg0, 32);
				method12(arg3, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method12(arg3, arg0, 1);
				method12(arg3 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method12(arg3, arg0, 4);
				method12(arg3 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method12(arg3, arg0, 16);
				method12(arg3 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method12(arg3, arg0, 64);
				method12(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method12(arg3, arg0, 130);
				method12(arg3 - 1, arg0, 8);
				method12(arg3, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method12(arg3, arg0, 10);
				method12(arg3, arg0 + 1, 32);
				method12(arg3 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method12(arg3, arg0, 40);
				method12(arg3 + 1, arg0, 128);
				method12(arg3, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method12(arg3, arg0, 160);
				method12(arg3, arg0 - 1, 2);
				method12(arg3 - 1, arg0, 8);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method12(arg3, arg0, 0x10000);
					method12(arg3 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method12(arg3, arg0, 1024);
					method12(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method12(arg3, arg0, 4096);
					method12(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method12(arg3, arg0, 16384);
					method12(arg3, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method12(arg3, arg0, 512);
					method12(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method12(arg3, arg0, 2048);
					method12(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method12(arg3, arg0, 8192);
					method12(arg3 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method12(arg3, arg0, 32768);
					method12(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method12(arg3, arg0, 66560);
					method12(arg3 - 1, arg0, 4096);
					method12(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method12(arg3, arg0, 5120);
					method12(arg3, arg0 + 1, 16384);
					method12(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method12(arg3, arg0, 20480);
					method12(arg3 + 1, arg0, 0x10000);
					method12(arg3, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method12(arg3, arg0, 81920);
					method12(arg3, arg0 - 1, 1024);
					method12(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ASFXKKJM.a(IIIIBZI)V")
	public void method11(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field9;
		arg3 -= field10;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field11) {
				for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field12) {
						method12(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ASFXKKJM.a(IIZI)V")
	public void method12(int arg0, int arg1, int arg2) {
		field13[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ASFXKKJM.b(III)V")
	public void method13(int arg0, int arg1) {
		arg1 -= field9;
		arg0 -= field10;
		field13[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ASFXKKJM.a(IIIIIII)Z")
	public boolean method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg2) {
			return true;
		}

		arg4 -= field9;
		arg2 -= field10;
		arg5 -= field9;
		arg0 -= field10;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (arg5 - 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field13[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field13[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 == arg5 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg5 - 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 + 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field13[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field13[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 == arg5 && arg0 - 1 == arg2) {
					return true;
				}

				if (arg5 - 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				if (arg5 - 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field13[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg5 - 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field13[arg4][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 - 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field13[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg5 - 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field13[arg4][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg4 == arg5 && arg0 + 1 == arg2 && (field13[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg0 - 1 == arg2 && (field13[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg4 && arg0 == arg2 && (field13[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ASFXKKJM.b(IIIIIII)Z")
	public boolean method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg1) {
			return true;
		}

		arg4 -= field9;
		arg0 -= field10;
		arg3 -= field9;
		arg1 -= field10;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg3 + 1 == arg4 && arg0 == arg1 && (field13[arg4][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field13[arg4][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field13[arg4][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg0 && (field13[arg4][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field13[arg4][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field13[arg4][arg0] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 + 1 == arg4 && arg0 == arg1 && (field13[arg4][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg0 && (field13[arg4][arg0] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg3 == arg4 && arg1 + 1 == arg0 && (field13[arg4][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg1 - 1 == arg0 && (field13[arg4][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg1 && (field13[arg4][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg1 && (field13[arg4][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ASFXKKJM.a(IIIIIIII)Z")
	public boolean method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg6 - 1;
		int var9 = arg1 + arg4 - 1;
		if (arg5 >= arg6 && arg5 <= var8 && arg0 >= arg4 && arg0 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg0 >= arg4 && arg0 <= var9 && (field13[arg5 - field9][arg0 - field10] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg0 >= arg4 && arg0 <= var9 && (field13[arg5 - field9][arg0 - field10] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg0 && arg5 >= arg6 && arg5 <= var8 && (field13[arg5 - field9][arg0 - field10] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg5 >= arg6 && arg5 <= var8 && (field13[arg5 - field9][arg0 - field10] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
