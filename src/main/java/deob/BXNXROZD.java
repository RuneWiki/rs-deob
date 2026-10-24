package deob;

@ObfuscatedName("BXNXROZD")
public class BXNXROZD {

	@ObfuscatedName("BXNXROZD.f")
	public int field45 = 0;

	@ObfuscatedName("BXNXROZD.g")
	public int field46 = 0;

	@ObfuscatedName("BXNXROZD.h")
	public int field47;

	@ObfuscatedName("BXNXROZD.i")
	public int field48;

	@ObfuscatedName("BXNXROZD.j")
	public int[][] field49;

	public BXNXROZD(int arg0, int arg1) {
		field47 = arg1;
		field48 = arg0;
		field49 = new int[field47][field48];
		method12();
	}

	@ObfuscatedName("BXNXROZD.a()V")
	public void method12() {
		for (int var1 = 0; var1 < field47; var1++) {
			for (int var2 = 0; var2 < field48; var2++) {
				if (var1 == 0 || var2 == 0 || field47 - 1 == var1 || field48 - 1 == var2) {
					field49[var1][var2] = 0xFFFFFF;
				} else {
					field49[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("BXNXROZD.a(IIIZII)V")
	public void method13(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field45;
		arg4 -= field46;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method16(arg3, arg4, 128);
				method16(arg3 - 1, arg4, 8);
			}

			if (arg1 == 1) {
				method16(arg3, arg4, 2);
				method16(arg3, arg4 + 1, 32);
			}

			if (arg1 == 2) {
				method16(arg3, arg4, 8);
				method16(arg3 + 1, arg4, 128);
			}

			if (arg1 == 3) {
				method16(arg3, arg4, 32);
				method16(arg3, arg4 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method16(arg3, arg4, 1);
				method16(arg3 - 1, arg4 + 1, 16);
			}

			if (arg1 == 1) {
				method16(arg3, arg4, 4);
				method16(arg3 + 1, arg4 + 1, 64);
			}

			if (arg1 == 2) {
				method16(arg3, arg4, 16);
				method16(arg3 + 1, arg4 - 1, 1);
			}

			if (arg1 == 3) {
				method16(arg3, arg4, 64);
				method16(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method16(arg3, arg4, 130);
				method16(arg3 - 1, arg4, 8);
				method16(arg3, arg4 + 1, 32);
			}

			if (arg1 == 1) {
				method16(arg3, arg4, 10);
				method16(arg3, arg4 + 1, 32);
				method16(arg3 + 1, arg4, 128);
			}

			if (arg1 == 2) {
				method16(arg3, arg4, 40);
				method16(arg3 + 1, arg4, 128);
				method16(arg3, arg4 - 1, 2);
			}

			if (arg1 == 3) {
				method16(arg3, arg4, 160);
				method16(arg3, arg4 - 1, 2);
				method16(arg3 - 1, arg4, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method16(arg3, arg4, 0x10000);
					method16(arg3 - 1, arg4, 4096);
				}

				if (arg1 == 1) {
					method16(arg3, arg4, 1024);
					method16(arg3, arg4 + 1, 16384);
				}

				if (arg1 == 2) {
					method16(arg3, arg4, 4096);
					method16(arg3 + 1, arg4, 0x10000);
				}

				if (arg1 == 3) {
					method16(arg3, arg4, 16384);
					method16(arg3, arg4 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method16(arg3, arg4, 512);
					method16(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg1 == 1) {
					method16(arg3, arg4, 2048);
					method16(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg1 == 2) {
					method16(arg3, arg4, 8192);
					method16(arg3 + 1, arg4 - 1, 512);
				}

				if (arg1 == 3) {
					method16(arg3, arg4, 32768);
					method16(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method16(arg3, arg4, 66560);
					method16(arg3 - 1, arg4, 4096);
					method16(arg3, arg4 + 1, 16384);
				}

				if (arg1 == 1) {
					method16(arg3, arg4, 5120);
					method16(arg3, arg4 + 1, 16384);
					method16(arg3 + 1, arg4, 0x10000);
				}

				if (arg1 == 2) {
					method16(arg3, arg4, 20480);
					method16(arg3 + 1, arg4, 0x10000);
					method16(arg3, arg4 - 1, 1024);
				}

				if (arg1 == 3) {
					method16(arg3, arg4, 81920);
					method16(arg3, arg4 - 1, 1024);
					method16(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("BXNXROZD.a(IIIIZZI)V")
	public void method14(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg3 -= field45;
		arg2 -= field46;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg1;
			arg1 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg3; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field47) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field48) {
						method16(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("BXNXROZD.a(III)V")
	public void method15(int arg0, int arg1) {
		arg0 -= field45;
		arg1 -= field46;
		field49[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("BXNXROZD.b(III)V")
	public void method16(int arg0, int arg1, int arg2) {
		field49[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("BXNXROZD.a(IIIIZI)V")
	public void method17(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field45;
		arg1 -= field46;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method19(arg2, 128, arg1);
				method19(arg2 - 1, 8, arg1);
			}

			if (arg4 == 1) {
				method19(arg2, 2, arg1);
				method19(arg2, 32, arg1 + 1);
			}

			if (arg4 == 2) {
				method19(arg2, 8, arg1);
				method19(arg2 + 1, 128, arg1);
			}

			if (arg4 == 3) {
				method19(arg2, 32, arg1);
				method19(arg2, 2, arg1 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method19(arg2, 1, arg1);
				method19(arg2 - 1, 16, arg1 + 1);
			}

			if (arg4 == 1) {
				method19(arg2, 4, arg1);
				method19(arg2 + 1, 64, arg1 + 1);
			}

			if (arg4 == 2) {
				method19(arg2, 16, arg1);
				method19(arg2 + 1, 1, arg1 - 1);
			}

			if (arg4 == 3) {
				method19(arg2, 64, arg1);
				method19(arg2 - 1, 4, arg1 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method19(arg2, 130, arg1);
				method19(arg2 - 1, 8, arg1);
				method19(arg2, 32, arg1 + 1);
			}

			if (arg4 == 1) {
				method19(arg2, 10, arg1);
				method19(arg2, 32, arg1 + 1);
				method19(arg2 + 1, 128, arg1);
			}

			if (arg4 == 2) {
				method19(arg2, 40, arg1);
				method19(arg2 + 1, 128, arg1);
				method19(arg2, 2, arg1 - 1);
			}

			if (arg4 == 3) {
				method19(arg2, 160, arg1);
				method19(arg2, 2, arg1 - 1);
				method19(arg2 - 1, 8, arg1);
			}
		}

		if (arg3) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method19(arg2, 0x10000, arg1);
					method19(arg2 - 1, 4096, arg1);
				}

				if (arg4 == 1) {
					method19(arg2, 1024, arg1);
					method19(arg2, 16384, arg1 + 1);
				}

				if (arg4 == 2) {
					method19(arg2, 4096, arg1);
					method19(arg2 + 1, 0x10000, arg1);
				}

				if (arg4 == 3) {
					method19(arg2, 16384, arg1);
					method19(arg2, 1024, arg1 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method19(arg2, 512, arg1);
					method19(arg2 - 1, 8192, arg1 + 1);
				}

				if (arg4 == 1) {
					method19(arg2, 2048, arg1);
					method19(arg2 + 1, 32768, arg1 + 1);
				}

				if (arg4 == 2) {
					method19(arg2, 8192, arg1);
					method19(arg2 + 1, 512, arg1 - 1);
				}

				if (arg4 == 3) {
					method19(arg2, 32768, arg1);
					method19(arg2 - 1, 2048, arg1 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method19(arg2, 66560, arg1);
					method19(arg2 - 1, 4096, arg1);
					method19(arg2, 16384, arg1 + 1);
				}

				if (arg4 == 1) {
					method19(arg2, 5120, arg1);
					method19(arg2, 16384, arg1 + 1);
					method19(arg2 + 1, 0x10000, arg1);
				}

				if (arg4 == 2) {
					method19(arg2, 20480, arg1);
					method19(arg2 + 1, 0x10000, arg1);
					method19(arg2, 1024, arg1 - 1);
				}

				if (arg4 == 3) {
					method19(arg2, 81920, arg1);
					method19(arg2, 1024, arg1 - 1);
					method19(arg2 - 1, 4096, arg1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("BXNXROZD.a(IZIIZII)V")
	public void method18(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg2 -= field45;
		arg4 -= field46;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg3; var9++) {
			if (var9 >= 0 && var9 < field47) {
				for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field48) {
						method19(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("BXNXROZD.a(IIII)V")
	public void method19(int arg0, int arg1, int arg2) {
		field49[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("BXNXROZD.a(IIB)V")
	public void method20(int arg0, int arg1) {
		arg0 -= field45;
		arg1 -= field46;
		field49[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("BXNXROZD.a(IIIIZII)Z")
	public boolean method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg0 == arg5) {
			return true;
		}

		arg2 -= field45;
		arg5 -= field46;
		arg1 -= field45;
		arg0 -= field46;
		if (arg4 == 0) {
			if (arg3 == 0) {
				if (arg1 - 1 == arg2 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field49[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field49[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 == arg2 && arg0 + 1 == arg5) {
					return true;
				}

				if (arg1 - 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 + 1 == arg2 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field49[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field49[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 == arg2 && arg0 - 1 == arg5) {
					return true;
				}

				if (arg1 - 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				if (arg1 - 1 == arg2 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field49[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field49[arg2][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field49[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 - 1 == arg2 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field49[arg2][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg1 == arg2 && arg0 + 1 == arg5 && (field49[arg2][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg0 - 1 == arg5 && (field49[arg2][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg2 && arg0 == arg5 && (field49[arg2][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BXNXROZD.b(IIIIZII)Z")
	public boolean method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg3 == arg4) {
			return true;
		}

		arg0 -= field45;
		arg4 -= field46;
		arg5 -= field45;
		arg3 -= field46;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg5 + 1 == arg0 && arg3 == arg4 && (field49[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4 && (field49[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg5 - 1 == arg0 && arg3 == arg4 && (field49[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4 && (field49[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 - 1 == arg0 && arg3 == arg4 && (field49[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4 && (field49[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg5 + 1 == arg0 && arg3 == arg4 && (field49[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4 && (field49[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg0 == arg5 && arg3 + 1 == arg4 && (field49[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg3 - 1 == arg4 && (field49[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg0 && arg3 == arg4 && (field49[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg0 && arg3 == arg4 && (field49[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BXNXROZD.a(IIIIIIII)Z")
	public boolean method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 - 1;
		int var9 = arg0 + arg3 - 1;
		if (arg5 >= arg2 && arg5 <= var8 && arg6 >= arg3 && arg6 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg5 && arg6 >= arg3 && arg6 <= var9 && (field49[arg5 - field45][arg6 - field46] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg6 >= arg3 && arg6 <= var9 && (field49[arg5 - field45][arg6 - field46] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg6 && arg5 >= arg2 && arg5 <= var8 && (field49[arg5 - field45][arg6 - field46] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg5 >= arg2 && arg5 <= var8 && (field49[arg5 - field45][arg6 - field46] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
